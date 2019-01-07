package Google;

import Files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class XML {

    Properties properties = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File f = new File("src\\test\\java\\Files");
        File fs = new File(f, "env.properties");
        FileInputStream file = new FileInputStream(fs);
        properties.load(file);
    }


    @Test
    public void Test() throws  IOException{

        RestAssured.baseURI = properties.getProperty("GOOGLE_HOST");

        String requestBody = Extensions.GenerateStringFromResource("src\\test\\java\\Files\\postdata.xml");

//Task 1 - take the responce
//        System.out.println(resources.getResourceAdressToAddLocationWithXML());
//        System.out.println(requestBody);
        Response responce =
                given().
                        queryParam("Google_Key", properties.getProperty("Google_Key")).
                        body(requestBody).

                        when().post(resources.getResourceAdressToAddLocationWithXML()).
                        then().assertThat().statusCode(200).

                        and().
                        contentType(ContentType.XML).
//                        and().
//                        body("status",equalTo("OK")).

                        extract().response();


        XmlPath responceXML = Extensions.responceToXML(responce);


//        Task 2 - convert the responceString to Google.XML and take place_id
        String place_id = responceXML.get("response.place_id");
        System.out.println(place_id);

//        //Task 3 - insert place_id to the delete request
//        given().
//                queryParam("key", "qaclick123").
//                body("{"+
//                        "\"place_id\": \""+place_id+"\""+
//                        "}").
//
//                when().post("maps/api/place/delete/json").
//                then().assertThat().statusCode(200).
//                and().
//                contentType(ContentType.JSON).
//                and().
//                body("status",equalTo("OK"))
//        ;



    }

}

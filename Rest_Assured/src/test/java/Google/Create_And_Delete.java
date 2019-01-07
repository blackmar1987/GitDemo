package Google;

import Files.resources;
import Files.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Create_And_Delete {

    Properties properties = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File f = new File("src\\test\\java\\Files");
        File fs = new File(f, "env.properties");
        FileInputStream file = new FileInputStream(fs);
        properties.load(file);
    }


    @Test
    public void Test(){

        RestAssured.baseURI = properties.getProperty("GOOGLE_HOST");

        String requestBody = requestData.JsonPostDataString();

//Task 1 - take the responce
        Response responce =
        given().
                queryParam("Google_Key", properties.getProperty("Google_Key")).
                body(requestBody).

                when().post(resources.getResourceAdressToAddLocationWithJSON()).
                then().assertThat().statusCode(200).
                and().
                contentType(ContentType.JSON).
                and().
                body("status",equalTo("OK")).

                extract().response();


        String responceString = responce.asString();
        System.out.println(responceString);

        //Task 2 - convert the responceString to JSON and take place_id
        JsonPath responceJSON = new JsonPath(responceString);

        String place_id = responceJSON.get("place_id");
        System.out.println(place_id);

        //Task 3 - insert place_id to the delete request
        given().
                queryParam("Google_Key", "qaclick123").
                body("{"+
                        "\"place_id\": \""+place_id+"\""+
                        "}").

                when().post("maps/api/place/delete/json").
                then().assertThat().statusCode(200).
                and().
                contentType(ContentType.JSON).
                and().
                body("status",equalTo("OK"))
            ;

    }

}

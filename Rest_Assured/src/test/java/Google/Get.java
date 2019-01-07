package Google;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class Get {

    @Test
    public  void Test() {

        RestAssured.baseURI = "https://maps.googleapis.com";

        given().param("location", "-33.8670522,151.1957362").
                param("radius", "500").
                param("Google_Key", "AIzaSyDDZ7JhuAuth-smeVXz9WhxAwK_xtTa6FM")
//                header("","").
//                cookie("","").
//                body("","")
        .when().
                get("/maps/api/place/nearbysearch/json").
                then().
                assertThat().statusCode(200).
                and().
                assertThat().contentType("application/json").
                and().
                assertThat().contentType(ContentType.JSON)
                .
                and().
                body("results[0].name",equalTo("Sydney")).
                and().
                header("server", "scaffolding on HTTPServer2")
        ;

    }

}

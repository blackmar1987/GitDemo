package JIRA_Testing;

import Files.requestData;
import Files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import static io.restassured.RestAssured.given;


public class Extensions {


    static Properties properties = new Properties();

    public static String returnProperties(String RequiredProperty) throws IOException {
        File f = new File("src\\test\\java\\Files");
        File fs = new File(f, "env.properties");
        FileInputStream file = new FileInputStream(fs);
        properties.load(file);
        String RequiredPropertyValue = properties.getProperty(RequiredProperty);
        return RequiredPropertyValue;

    }


    public static String GenerateStringFromResource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    public static XmlPath responceToXML(Response r) {
        String respon = r.asString();
        XmlPath x = new XmlPath(respon);
        return x;
    }

    public static JsonPath responceToJson(Response r) {
        String respon = r.asString();
        JsonPath x = new JsonPath(respon);
        return x;
    }


    public static String JIRA_CreateSessionAndReturnSessionId() throws IOException {

        System.out.println("Start CreateSession");

        String CreateSessionRequestBody = requestData.JiraCreateSessionJsonPostDataString();
        RestAssured.baseURI = returnProperties("JIRA_HOST");
//        RestAssured.baseURI = "http://localhost:8085/";

        Response CreateSessionResponce =
                given().
                        header("Content-Type", "application/json").
                        body(CreateSessionRequestBody).
                        when().
                        post(resources.getResourceAdressToCreateJiraSession()).
                        then().assertThat().statusCode(200).
                        and().
                        contentType(ContentType.JSON).
                        and().

                        extract().response();

        String CreateSessionResponceString = CreateSessionResponce.asString();
//        System.out.println(CreateSessionResponceString);

        //Task 2 - convert the responceString to JSON and take place_id
        JsonPath CreateSessionResponceJSON = new JsonPath(CreateSessionResponceString);
        String session_value = CreateSessionResponceJSON.get("session.value");
        System.out.println("Session_id + " + session_value);
        System.out.println("End CreateSession");
        return session_value;
    }

    public static String JIRA_CreateIssueAndReturnIssueId(String Session_id) throws IOException {

        System.out.println("Start Create issue");
        String CreateIssueRequestBody = requestData.JiraCreateIssueJsonPostDataString();
        RestAssured.baseURI = returnProperties("JIRA_HOST");
//        RestAssured.baseURI = "http://localhost:8085/";
        Response CreateIssueResponce =
                given().
                        header("Content-Type", "application/json").
                        header("Cookie", "JSESSIONID=" + Session_id).
                        body(CreateIssueRequestBody).
                        when().
                        post(resources.getResourceAdressToCreateJiraIssue()).
                        then().assertThat().statusCode(201).
                        and().
                        contentType(ContentType.JSON).
                        and().

                        extract().response();

        String CreateIssueResponceString = CreateIssueResponce.asString();
        System.out.println(CreateIssueResponceString);

        JsonPath CreateIssueResponceJSON = new JsonPath(CreateIssueResponceString);

        String Issue_id = CreateIssueResponceJSON.get("id");
        System.out.println("Issue id +" + Issue_id);
        System.out.println("End Create issue");

        return Issue_id;
    }


    public static String JIRA_AddCommentToTheIssue(String Session_id, String Issue_id) throws IOException {
        System.out.println("Start Adding Comment");

        String AddCommentToTheIssueRequestBody = requestData.JiraAddCommentToTheIssueJsonPostDataString();
        RestAssured.baseURI = returnProperties("JIRA_HOST");
//        RestAssured.baseURI = "http://localhost:8085/";
        Response AddCommentToJiraIssueResponce =
                given().
                        header("Content-Type", "application/json").
                        header("Cookie", "JSESSIONID=" + Session_id).
                        body(AddCommentToTheIssueRequestBody).
                        when().
                        post(resources.getResourceAdressToAddCommentToJiraIssue(Issue_id)).
                        then().assertThat().statusCode(201).
                        and().
                        contentType(ContentType.JSON).
                        and().

                        extract().response();

        String AddCommentToJiraIssueResponceString = AddCommentToJiraIssueResponce.asString();
        System.out.println(AddCommentToJiraIssueResponceString);


        JsonPath AddCommentToTheIssueJSON = new JsonPath(AddCommentToJiraIssueResponceString);

        String Comment_id = AddCommentToTheIssueJSON.get("id");
        System.out.println("Comment id +" + Issue_id);


        System.out.println("End Adding Comment");

        return Comment_id;
    }



    public static String JIRA_AddCommentToTheIssueWithPut(String Session_id, String Issue_id, String Comment_id) throws IOException {
        System.out.println("Start Adding Comment with PUT");
        System.out.println("check resource for put "+resources.getResourceAdressToAddCommentToJiraIssueWithPut(Issue_id, Comment_id));

        String AddCommentToTheIssueWithPutRequestBody = requestData.JiraAddCommentToTheIssueWithPutJsonPostDataString();
        RestAssured.baseURI = returnProperties("JIRA_HOST");
//        RestAssured.baseURI = "http://localhost:8085/";
        Response AddCommentToJiraIssueResponce =
                given().
                        header("Content-Type", "application/json").
                        header("Cookie", "JSESSIONID=" + Session_id).
                        body(AddCommentToTheIssueWithPutRequestBody).
                        when().
                        put(resources.getResourceAdressToAddCommentToJiraIssueWithPut(Issue_id, Comment_id)).

                        then().assertThat().statusCode(200).
                        and().
                        contentType(ContentType.JSON).
                        and().

                        extract().response();

        String AddCommentToJiraIssueResponceString = AddCommentToJiraIssueResponce.asString();
        System.out.println(AddCommentToJiraIssueResponceString);




        JsonPath AddCommentToTheIssueJSON = new JsonPath(AddCommentToJiraIssueResponceString);

        String comment_id = AddCommentToTheIssueJSON.get("id");
        System.out.println("Comment id +" + comment_id);
        System.out.println("End Adding Comment With PUT");
        return comment_id;

    }


    public static void JIRA_DeleteIssueAndReturnIssueId(String Session_id, String Issue_id) throws IOException {

        System.out.println("Start Delete issue");
        String CreateIssueRequestBody = requestData.JiraAddCommentToTheIssueWithPutJsonPostDataString();
        RestAssured.baseURI = returnProperties("JIRA_HOST");
//        RestAssured.baseURI = "http://localhost:8085/";
        Response DeleteIssueResponce =
                given().
                        header("Content-Type", "application/json").
                        header("Cookie", "JSESSIONID=" + Session_id).
                        body(CreateIssueRequestBody).
                        when().
                        delete(resources.getResourceAdressToDeleteJiraIssue(Issue_id)).
                        then().assertThat().statusCode(204).
                        and().
                        contentType(ContentType.JSON).extract().response();

        System.out.println("End Delete issue");


    }






}
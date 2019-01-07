package Files;

public class resources {


    public static String getResourceAdressToAddLocationWithJSON(){
    String resource =  "maps/api/place/add/json";
    return resource;
    }


    public static String getResourceAdressToAddLocationWithXML(){
        String resource =  "maps/api/place/add/xml";
        return resource;
    }

    public static String getResourceAdressToCreateJiraSession() {
        String resource = "rest/auth/1/session";
        return resource;
    }

    public static String getResourceAdressToCreateJiraIssue() {
        String resource = "rest/api/2/issue";
        return resource;
    }


    public static String getResourceAdressToAddCommentToJiraIssue(String Issue_Id) {
        String resource = "rest/api/2/issue/" + Issue_Id + "/comment";
        return resource;
    }

    public static String getResourceAdressToAddCommentToJiraIssueWithPut(String Issue_Id,String Comment_id) {
        String resource = "rest/api/2/issue/" + Issue_Id + "/comment/" + Comment_id;
        return resource;
    }

    public static String getResourceAdressToDeleteJiraIssue(String Issue_Id) {
        String resource = "rest/api/2/issue/" + Issue_Id;
        return resource;
    }

}

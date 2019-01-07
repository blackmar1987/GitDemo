package Files;

public class requestData {

    public static String JsonPostDataString(){

        String JsonPostDataString = "{\n" +
                "    \"location\":{\n" +
                "        \"lat\" : -38.383494,\n" +
                "        \"lng\" : 33.427362\n" +
                "    },\n" +
                "    \"accuracy\":50,\n" +
                "    \"name\":\"Frontline house\",\n" +
                "    \"phone_number\":\"(+91) 983 893 3937\",\n" +
                "    \"address\" : \"29, side layout, cohen 09\",\n" +
                "    \"types\": [\"shoe park\",\"shop\"],\n" +
                "    \"website\" : \"http://google.com\",\n" +
                "    \"language\" : \"French-IN\"\n" +
                "}";

        return JsonPostDataString;

    }


    public static String JiraCreateSessionJsonPostDataString(){
        String JsonPostDataString = "{\n" +
                "  \"username\": \"blackmar\",\n" +
                "  \"password\": \"bendery\"\n" +
                "}";

        return JsonPostDataString;
    }

    public static String JiraCreateIssueJsonPostDataString(){
        String JsonPostDataString = "{\n" +
                "  \"fields\": {\n" +
                "  \t\"project\" :\n" +
                "  \t{\n" +
                "  \"key\": \"TEST\"\n" +
                "  \t},\n" +
                "  \"summary\": \"First Defect\",\n" +
                "   \"description\": \"First Defect description\",\n" +
                "   \"issuetype\": {\n" +
                "   \t\"name\" : \"Bug\"\n" +
                "}\n" +
                "}\n" +
                "}";

        return JsonPostDataString;
    }

    public static String JiraAddCommentToTheIssueJsonPostDataString(){
        String JsonPostDataString = "{\n" +
                "  \"body\" : \"comment from REST API\" ,\n" +
                "  \"visibility\": {\n" +
                "    \"type\": \"role\",\n" +
                "    \"value\": \"Administrators\"\n" +
                "  }\n" +
                "}";

        return JsonPostDataString;
    }

    public static String JiraDeleteIssueJsonPostDataString(){
        String JsonPostDataString = "{\n" +
                "  \"body\" : \"new comment from REST API\" ,\n" +
                "  \"visibility\": {\n" +
                "    \"type\": \"role\",\n" +
                "    \"value\": \"Administrators\"\n" +
                "  }\n" +
                "}";

        return JsonPostDataString;
    }


    public static String JiraAddCommentToTheIssueWithPutJsonPostDataString(){
        String JsonPostDataString = "{\n" +
                "  \"body\" : \"new comment from REST API\" ,\n" +
                "  \"visibility\": {\n" +
                "    \"type\": \"role\",\n" +
                "    \"value\": \"Administrators\"\n" +
                "  }\n" +
                "}";

        return JsonPostDataString;
    }


}

package JIRA_Testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class JIRA {

    Properties properties = new Properties();

    @BeforeTest
    public void getData() throws IOException {
        File f = new File("src\\test\\java\\Files");
        File fs = new File(f, "env.properties");
        FileInputStream file = new FileInputStream(fs);
        properties.load(file);
    }

    @Test
    public void Test() throws IOException, InterruptedException {

        //Task 1 - create session and take the sesion_id
        String session_id = Extensions.JIRA_CreateSessionAndReturnSessionId();

        //Task 2 - create issue and take the issue_id
        String issue_id = Extensions.JIRA_CreateIssueAndReturnIssueId(session_id);


        //Task 3 - add some comment to the issue
        String Issue_comment = Extensions.JIRA_AddCommentToTheIssue(session_id, issue_id);

//            //Task 4 - add some new comment to the issue with PUT
//            String New_Issue_comment = Google.Extensions.JIRA_AddCommentToTheIssueWithPut(session_id, issue_id,Issue_comment);


        //Task 4 - Delete Issue
        Thread.sleep(10000);


        Extensions.JIRA_DeleteIssueAndReturnIssueId(session_id,issue_id);


    }


}




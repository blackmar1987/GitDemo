package stepDefinations;

import JIRA_TESTING.Extensions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Jira_Definations {



    Properties properties = new Properties();
    String session_id;
    String issue_id;
    String Issue_comment;

    //Task 1 - create session and take the sesion_id
    @Given("^create session and take the sesion_id$")
    public void JIRA_CreateSessionAndReturnSessionId() throws IOException {

        File f = new File("src\\test\\java\\Files");
        File fs = new File(f, "env.properties");
        FileInputStream file = new FileInputStream(fs);
        properties.load(file);
        String session_id = Extensions.JIRA_CreateSessionAndReturnSessionId();
    }

    @When("^create issue and take the issue_id$")
    public void JIRA_CreateIssueAndReturnIssueId() throws IOException {
        String issue_id = Extensions.JIRA_CreateIssueAndReturnIssueId(session_id);
    }

    @And("^add some comment to the issue$")
    public void JIRA_AddCommentToTheIssue() throws IOException {
        String Issue_comment = Extensions.JIRA_AddCommentToTheIssue(session_id, issue_id);
    }



    @Then("Delete Issue")
    public void JIRA_DeleteIssueAndReturnIssueId()  throws IOException, InterruptedException {
        Thread.sleep(10000);
        Extensions.JIRA_DeleteIssueAndReturnIssueId(session_id,issue_id);
    }


}

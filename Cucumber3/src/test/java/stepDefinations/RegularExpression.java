package stepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegularExpression {

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }


    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
        System.out.println(arg2);
    }

}

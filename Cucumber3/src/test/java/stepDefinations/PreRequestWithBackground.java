package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PreRequestWithBackground {

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is started");
    }

}

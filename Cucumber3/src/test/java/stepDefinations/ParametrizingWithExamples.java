package stepDefinations;

import cucumber.api.java.en.When;

public class ParametrizingWithExamples {

    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);

    }

}

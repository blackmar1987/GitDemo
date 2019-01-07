package JIRA_TESTRUNNER;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/java/features",
        features = "D:\\JAVA+HTML\\JAVA\\Cucumber3\\src\\test\\java\\features\\JIRA.feature",
        glue="stepDefinations",tags="@JiraTest",strict=true,monochrome=true,
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})


public class Jira_Test_Runner {

}

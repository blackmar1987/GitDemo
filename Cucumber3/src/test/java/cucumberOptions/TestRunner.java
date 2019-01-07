package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations",
		tags="@PortalTest",//run only tagged scenarios!!!
		//tags="@MobileTest,@WebTest",//run only tagged scenarios!!!
		//dryrun=true - with this testrunner will scan all the scenarios if they have definitions and not run the tests
		strict=true, //this attribute will run all the missing steps(with no implementation) so they will be not passed blindly
		monochrome=true,// this attribute will change your output in normal way



	    //you can user plugin property for reports generation
		//pretty keyword will apply colors to your reports: green for passed, red for failed
		//html:target/cucumber means generate html report in target folder
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {

}

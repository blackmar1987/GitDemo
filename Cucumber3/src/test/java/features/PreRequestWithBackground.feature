Feature:
  //Background keyword is the same as BeforeClass annotation - it will be runned before all of scenarios
  //2 scenarios = 2 Background runned
  //but this is a prerequest for current feature file only
  //that means that Background scenarion can be started after some other scenarios from another feature files

  //if you want to run something before specified with tag tests - you should use @Before("@MobileTest") annotation
  // -->>> stepDefinations.hooks
  //YO CAN NOT USE Background and @Before together!!!


  Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"
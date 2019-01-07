$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Portal Login",
  "description": "",
  "id": "portal-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User login into application with \"john\" and password \"4321\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 90932054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john",
      "offset": 34
    },
    {
      "val": "4321",
      "offset": 54
    }
  ],
  "location": "RegularExpression.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 1598578,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 53476,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "RegularExpression.cards_displayed_are(String)"
});
formatter.result({
  "duration": 89884,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "jenny",
        "abcd",
        "john@abcd.com",
        "Australia",
        "3242353"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 65423,
  "status": "passed"
});
formatter.match({
  "location": "dataTable.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "duration": 1212018,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 118044,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "RegularExpression.cards_displayed_are(String)"
});
formatter.result({
  "duration": 105245,
  "status": "passed"
});
formatter.uri("PreRequestWithBackground.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "//Background keyword is the same as BeforeClass annotation - it will be runned before all of scenarios\r\n//2 scenarios \u003d 2 Background runned\r\n//but this is a prerequest for current feature file only\r\n//that means that Background scenarion can be started after some other scenarios from another feature files\r\n\r\n//if you want to run something before specified with tag tests - you should use @Before(\"@MobileTest\") annotation\r\n// --\u003e\u003e\u003e stepDefinations.hooks\r\n//YO CAN NOT USE Background and @Before together!!!",
  "id": "",
  "keyword": "Feature"
});
formatter.background({
  "line": 12,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 13,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Browser is triggered",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "check if browser is started",
  "keyword": "Then "
});
formatter.match({
  "location": "PreRequestWithBackground.validate_the_browser()"
});
formatter.result({
  "duration": 74809,
  "status": "passed"
});
formatter.match({
  "location": "PreRequestWithBackground.browser_is_triggered()"
});
formatter.result({
  "duration": 51200,
  "status": "passed"
});
formatter.match({
  "location": "PreRequestWithBackground.check_if_browser_is_started()"
});
formatter.result({
  "duration": 307769,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Home page default login",
  "description": "",
  "id": ";home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 49493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "RegularExpression.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 125440,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 39538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "RegularExpression.cards_displayed_are(String)"
});
formatter.result({
  "duration": 76515,
  "status": "passed"
});
formatter.background({
  "line": 12,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 13,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Browser is triggered",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "check if browser is started",
  "keyword": "Then "
});
formatter.match({
  "location": "PreRequestWithBackground.validate_the_browser()"
});
formatter.result({
  "duration": 54329,
  "status": "passed"
});
formatter.match({
  "location": "PreRequestWithBackground.browser_is_triggered()"
});
formatter.result({
  "duration": 42951,
  "status": "passed"
});
formatter.match({
  "location": "PreRequestWithBackground.check_if_browser_is_started()"
});
formatter.result({
  "duration": 39822,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Home page default login",
  "description": "",
  "id": ";home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User login into application with \"john\" and password \"4321\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 59164,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john",
      "offset": 34
    },
    {
      "val": "4321",
      "offset": 54
    }
  ],
  "location": "RegularExpression.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 111218,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 39537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "RegularExpression.cards_displayed_are(String)"
});
formatter.result({
  "duration": 71680,
  "status": "passed"
});
});
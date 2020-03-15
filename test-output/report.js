$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/OrangeHRMLoginPage.feature");
formatter.feature({
  "name": "Login Page features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into website using valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMLoginPage.i_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMLoginPage.i_enter_my_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMLoginPage.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to login into website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMLoginPage.i_should_be_able_to_login_into_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMLoginPage.close_browser()"
});
formatter.result({
  "status": "passed"
});
});
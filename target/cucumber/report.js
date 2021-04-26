$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/ChoiceAdvantageLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Validate ChoiceAdvantage Login Page Functionality",
  "description": "",
  "id": "validate-choiceadvantage-login-page-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "duration": 3515757685,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the ChoiceAdvantage Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.User_is_on_the_ChoiceAdvantage_Login_Page()"
});
formatter.result({
  "duration": 330039158,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-choiceadvantage-login-page-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters the userid as \"hpatel.txa01\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters the password as \"Pooja94\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be able to land on Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hpatel.txa01",
      "offset": 27
    }
  ],
  "location": "StepDef.User_enters_the_userid(String)"
});
formatter.result({
  "duration": 84421436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pooja94",
      "offset": 29
    }
  ],
  "location": "StepDef.user_enters_the_password_as(String)"
});
formatter.result({
  "duration": 58694051,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5708606627,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_be_able_to_land_on_Welcome_Page()"
});
formatter.result({
  "duration": 460108030,
  "status": "passed"
});
formatter.after({
  "duration": 178707885,
  "status": "passed"
});
});
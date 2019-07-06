$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on FormBuilder page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_FormBuilder_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the Formbuilder logo",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_see_the_Formbuilder_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I provide valid mail and password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_provide_valid_mail_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I uncheck Keep me logged in",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_uncheck_Keep_me_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click loginsecond button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_loginsecond_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});
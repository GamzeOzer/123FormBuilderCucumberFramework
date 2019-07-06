#Autor: gamzeozr52@gmail.com

#User story: As a valid user, I should be able to login

Feature: Login

Background:

Given I am on FormBuilder page
And I see the Formbuilder logo
When I click login button

Scenario: Login with valid credentials
 And I provide valid mail and password
 And I uncheck Keep me logged in
 And I click loginsecond button
 Then I see dashboard
 


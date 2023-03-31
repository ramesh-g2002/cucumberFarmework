Feature: Login Functionality for Opencart E-commerce Website 

As a user of the OpenCart website 
I want  to be able to log in with my account 
So that I can access my account-related freatures and manage my order

 Scenario: Successful login with validcredentials
 Given I am on the OpenCart  login page "https://naveenautomationlabs.com/opencart/"
 Given I have entered a valid username and password
 When I click on the login button
 Then I should be logged in successfully
 Examples:
|username|password|error-massage|
|7397535947|Ramesh@12|Warning-No macth for Email address and/or Password|

Feature: HRM Functionality verification

Scenario: Verify user is able to login with valid user id and password

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed

Scenario: Verify user is able to apply leave

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed
Then user is able to apply leave

Scenario: Search for users using methodoverloading

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed
Then user to search for users
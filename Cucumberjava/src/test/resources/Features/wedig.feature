Feature: test startup login functionality

  Scenario: Check startup login is successful with valid credentials
    Given startup browser is open
    And user is on startup login page
    When user enters startup username and password
    And user clicks on startup login
    Then user is navigated to the startup home page
    And user publishes the solution

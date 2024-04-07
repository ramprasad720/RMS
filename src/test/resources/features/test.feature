@SmokeFeature
Feature: feature to test login functionality
@Smoketest
  Scenario: Check login is successful wil valid credentials
    Given User is on login pagen
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

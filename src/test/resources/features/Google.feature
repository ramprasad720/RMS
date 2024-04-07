@SmokeFeature
Feature: feature to test Google Search result functionality

  @Smoketest
  Scenario: Check User is navigated to google search reult page
    Given Browser is open
    And user is navigated to Google search Page
    When User enters "ViratKohli" in Searchbox
    And user clicks on "search" field
    Then User is navigated to the search result page

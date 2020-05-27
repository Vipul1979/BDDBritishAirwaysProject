Feature: Homepage functionality
  @smoke
  Scenario: Search flight
    Given user is on the British Airways Homepage
    When user click on Book a flight
    Then user can see departure country option
    And user click on usa
    @regression
    Scenario: Discover mor than a flight page
      Given user is on the British Airways Homepage
      When user click on Discover
      And user click on The BA experience
      Then user can see more than a flight page


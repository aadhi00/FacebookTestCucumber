Feature: Checking the login feature of facebook

  Scenario: User should be able to login
    Given User is in the facebook login page
    When User enters username and password
      | username   | password |
      | aadhithyan | asdfgf   |
      | priyaram   | wertyu   |
    And User clicks login button
    Then User should be logged into facebook

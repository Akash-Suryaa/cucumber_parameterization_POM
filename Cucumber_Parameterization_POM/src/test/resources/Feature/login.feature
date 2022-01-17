Feature: Test login functinality

  Scenario: Test login with valid credentilas
    Given Open Browser and launch Application
    When User enter valid username and valid password
    Then User should navigate successfully

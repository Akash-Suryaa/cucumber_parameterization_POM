Feature: Test login Functinality

  Scenario Outline: Test login functionality with valid credentials
    Given Open browser and launch the application
    When User enters valid <username> and  <password>
    Then User should be able to navigate successfully

Examples:

|username|password|
|Admin|admin123|
|Akash|admin456|
|Swapnil|admin789|
    

@tag
Feature: Admin login
  I want to use this template for check admin login

  @tag1
  Scenario: check admin login with valid input
    Given I open browser with url "http://webapp.qedgetech.com"
    When I enter user name as "admin"
    And i enter user password as "master"
    And i click login
    Then i should see login page
    When i click logout
    Then i should see login page
    When i close browser
    
    
Feature: Login Page features

  Scenario: Login into website using valid username and password
    Given I launch the browser
    When I enter my valid username and password
    And I click on login button
    Then I should be able to login into website
    And close browser



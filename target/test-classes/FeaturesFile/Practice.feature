Feature: Testflipcart application

  Scenario: Test for flipkart Application
    Given Open the practice  page
    When Test the user and passwords login credentials
      | email    | password             |
      | practice | SuperSecretPassword! |
    When Test the login button
    Then Test for Login is success or Not

Feature: Login Test

  Scenario: User login to a page
    Given user navigates to the login page
    When the user enters username "exampleuser" and password "examplepass" in username and password fields
    And clicks the login button
    Then the user should be logged in successfully

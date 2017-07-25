Feature: Nopcommerce Login

  As a new user trying to login a page

  @smoke
  Scenario:User Login

    Given the user opens the nopcommerce site
    When the user decides to login
    Then click the login button
    When user  logsin again with his credentials
    And user clicks on the login button
    And user see the message "you are successfully loggedin"
    Then  the user expects to see the Myaccount link

  @smoke
    Scenario: Invalid login
      Given the user opens the nopcommerce site
      When the user decides to enter invalid login details
      And click the login button
      Then the error message displayed as "Invalid Login Details"









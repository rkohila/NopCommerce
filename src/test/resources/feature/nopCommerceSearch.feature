Feature: Nop commerce search functionality to be implemented


  Background:
    Given the user opens the nopcommerce site
    When the user decides to register
    Then verify the register link


  Scenario:User Product search
    When user tries to search for a  product
    Then user view the list of search product list



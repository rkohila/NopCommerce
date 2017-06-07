Feature: Nop commerce registration

  Background:
    Given the user opens the nopcommerce site
    When the user decides to register
    Then verify the register link

  @smoke
  Scenario:User Registration
    When user fills and submits the  regsitration form
    Then user view the successful register message "Your registration completed"


  @validation
  Scenario: User Registration validation messages
    When user submits the empty form
    Then the error message displayed as "First name is required."


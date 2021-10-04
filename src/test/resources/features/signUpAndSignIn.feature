Feature: User wants to sign up or sign in
  Scenario: User sees the registration form
    Given the user wants to sign up
    When the user clicks on the button for sign up
    Then the user sees a registration form

  Scenario: User completes incorrectly the registration form
    Given the user wants to complete the registration form
    When the user completes incorrectly the form
    Then the system does not enable the button to continue registration.

  Scenario: User sees subscription plans
    Given the user wants to complete the registration form
    When the user completes the form
    Then the system displays the subscription plan section

  Scenario: User signs in
    Given the user wants to sign in
    When the user completes the account and the password
    And the user clicks on the button for sign in
    Then the user is on the home page

  Scenario: User tries to signs in
    Given the user wants to sign in
    When the user completes incorrectly the account or the password
    And the user clicks on the button for sign in
    Then the system displays a message indicating the reason for the rejection

  Scenario: User resets his password
    Given the user is on the password reset section
    When the user indicates which is his email address
    Then the user receives his password to the validated email

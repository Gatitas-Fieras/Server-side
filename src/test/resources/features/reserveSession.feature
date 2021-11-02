Feature: Client wants to reserve a session
  Scenario: Client sees the tutor's list
    Given the client is on the home page
    When the client clicks on the button to see tutors
    Then the client sees tutor's list

  Scenario: Client sees the tutor profile
    Given the client sees tutor's list
    When the client clicks on the button to see profile
    Then the client sees selected tutor's profile
  
  Scenario: Client completes the form
    Given the client sees selected tutor's profile
    When the client clicks on the button to reserve
    Then the client completes the form

  Scenario: Client reserves the session
    Given the client completes the form
    When the client clicks on the button to confirm
    Then the system displays a message indicating that the session has been reserved

  Scenario: Client reserves incorrectly the session
    Given the client completes incorrectly the form
    When the client clicks on the button to confirm
    Then the system displays a message indicating that the session has not been reserved and the reason for rejection

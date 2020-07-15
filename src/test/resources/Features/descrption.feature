Feature: validation of crm login
@google
 Scenario: Validation of login functionality of crm site
    Given login browser
    When login application
    Then enter Username and Passwd
    And enter login button
    And Quit browser
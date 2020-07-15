Feature: validation of crm login

 Scenario Outline: Validation of login functionality of crm site
    Given login browser
    When login application
    Then enter <Username> and <Passwd>
    And enter login button
    And Quit browser
    Examples:
    |Username          |Passwd|
    |neenub18@gmail.com|Itrust@3|
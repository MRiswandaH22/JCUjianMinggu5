Feature: Login User Shop Demoqa
  Scenario: User succesful login into web Shop Demoqa
    Given User open Browser and Url
    When User input valid username and password
    And User click button Login
    Then User go to page MyAccount
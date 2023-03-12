Feature: User Order in Shop Demoqa
  Scenario: User succesful add product to cart
    Given User open Browser and Url
    When User click button ToolsQa Demo Site
    And User go to Product Page
    And User click one product
    And User adding product to cart
    And User see the product in the cart
    And User click button checkout
    And User input first name and last name
    And User input company name
    And User add country
    And User input street addres
    And User input town or city
    And User input province
    And User input postcode
    And User input phone
    And User click agreement
    And User click button placeorder
    Then User get message succes order

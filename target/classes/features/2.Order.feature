Feature: User Order in Shop Demoqa
  Scenario: User succesful add product to cart
    Given User open Browser and Url
    When User click button ToolsQa Demo Site
    And User go to Product Page
    And User click one product
    And User adding product to cart
    Then User see the product in the cart and logout


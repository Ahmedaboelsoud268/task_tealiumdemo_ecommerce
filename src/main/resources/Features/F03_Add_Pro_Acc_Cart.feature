@smoke
Feature: End To End scenario
#As a logged user i can add product from accessories to cart
  Scenario Outline:add product from accessories to cart
    Given user click on the Account button and select login
    Then redirct me to the login page
    And user enter valid "<email>"
    And enter valid "<password>"
    When user click on login
    Then the login is done successfully
    When user navigate to accessories
    And user select shoes fro subcategory
    And user filter shoes by price
    And user view the details fo the product
    And user select the color and size
    When the user add this product to cart
    Then the product added successfully
    Examples:
      | email | password |
      | cr4@example.com | 1234567 |

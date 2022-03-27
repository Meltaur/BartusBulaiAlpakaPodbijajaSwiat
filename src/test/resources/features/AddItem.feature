Feature: Test Scenario for Adding item to Amazon cart
  Scenario: Add Item to cart
    Given User is on "Home Page"
    And User clicks on Headsets category page on "Home Page"
    And User clicks on first headphone on "Category Page"
    And User clicks on add to cart button on "Product Page"
    Then "Added to Cart" message is shown on "Add Item Page"
    And Count in cart is set to "1" on "Add Item Page"


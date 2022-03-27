Feature: Test Scenario for Deleting item from Amazon cart
  Scenario: Delete Item from cart
    Given User is on "Home Page"
    And User clicks on Headsets category page on "Home Page"
    And User clicks on first headphone on "Category Page"
    And User clicks on add to cart button on "Product Page"
    And User clicks on Go to Cart button on "Add Item Page"
    And User clicks on delete button on "Cart Page"
    Then "Your Amazon Cart is empty." message appears on "Cart Page"
    And Price of items in cart is equal to "$0.00" on "Cart Page"


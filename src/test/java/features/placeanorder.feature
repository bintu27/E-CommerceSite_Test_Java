@Regression
Feature: Add items to cart, validate items and place an order

  Scenario Outline: Verify successful placement of any order

    Given User is on Homepage of the application
    When User navigates to login page
    And User fills registration details
    Then Verify registered user on homepage

    When User selects "<itemName>" from homepage
    Then Verify selected product on the product detail page
    When User adds item to the cart from product detail page
    Then Verify "<itemName>" product on cart page

    And User click on continue to shopping button on Cart page
    When User selects "<itemName2>" from homepage
    Then Verify selected product on the product detail page
    When User adds item to the cart from product detail page
    Then Verify "<itemName2>" product on cart page

    When User proceeds to checkout from Cart page
    Then User verifies product details on Summary page
    When User clear cart on Summary page
    Then navigate to shopping screen

    When User selects "<itemName3>" from homepage
    Then User selects size of the dress on product detail page
    When User adds item to the cart from product detail page
    Then Verify "<itemName3>" product on cart page

    And User click on continue to shopping button on Cart page
    When User selects "<itemName>" from homepage
    Then User selects size of the dress on product detail page
    When User adds item to the cart from product detail page
    Then Verify "<itemName>" product on cart page

    When User proceeds to checkout from Cart page
    Then User verifies product details on Summary page
    When User clicks on proceed to checkout button on Summary page
    Then Verify "<addressType>" address on Address confirmation page

    When User clicks on proceed to checkout button on Address confirmation page
    Then Verify terms of service on Shipping page
    When User click on agree button on Shipping page
    And User click on proceed to checkout on Shipping page

    Then Verify product details on Payment page
    When select "<pay as>" as payment method on Payment page
    And User clicks on confirm my order button on payment page
    Then Verify order details on order confirmation page

    Examples:
      | itemName             | itemName2     | itemName3                   | addressType     | pay as       |
      | Printed Summer Dress | Printed Dress | Faded Short Sleeve T-shirts | Billing Address | Pay by check |
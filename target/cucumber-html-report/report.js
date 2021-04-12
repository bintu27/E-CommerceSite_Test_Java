$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeanorder.feature");
formatter.feature({
  "line": 2,
  "name": "Add items to cart, validate items and place an order",
  "description": "",
  "id": "add-items-to-cart,-validate-items-and-place-an-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify successful placement of any order",
  "description": "",
  "id": "add-items-to-cart,-validate-items-and-place-an-order;verify-successful-placement-of-any-order",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User fills registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify registered user on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects \"\u003citemName\u003e\" from homepage",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify selected product on the product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Verify \"\u003citemName\u003e\" product on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click on continue to shopping button on Cart page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User selects \"\u003citemName2\u003e\" from homepage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Verify selected product on the product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\u003citemName2\u003e\" product on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User proceeds to checkout from Cart page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User verifies product details on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User clear cart on Summary page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "navigate to shopping screen",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User selects \"\u003citemName3\u003e\" from homepage",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User selects size of the dress on product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify \"\u003citemName3\u003e\" product on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User click on continue to shopping button on Cart page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects \"\u003citemName\u003e\" from homepage",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User selects size of the dress on product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Verify \"\u003citemName\u003e\" product on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User proceeds to checkout from Cart page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User verifies product details on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User clicks on proceed to checkout button on Summary page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Verify \"\u003caddressType\u003e\" address on Address confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User clicks on proceed to checkout button on Address confirmation page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Verify terms of service on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User click on agree button on Shipping page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User click on proceed to checkout on Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify product details on Payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "select \"\u003cpay as\u003e\" as payment method on Payment page",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User clicks on confirm my order button on payment page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Verify order details on order confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 53,
  "name": "",
  "description": "",
  "id": "add-items-to-cart,-validate-items-and-place-an-order;verify-successful-placement-of-any-order;",
  "rows": [
    {
      "cells": [
        "itemName",
        "itemName2",
        "itemName3",
        "addressType",
        "pay as"
      ],
      "line": 54,
      "id": "add-items-to-cart,-validate-items-and-place-an-order;verify-successful-placement-of-any-order;;1"
    },
    {
      "cells": [
        "Printed Summer Dress",
        "Printed Dress",
        "Faded Short Sleeve T-shirts",
        "Billing Address",
        "Pay by check"
      ],
      "line": 55,
      "id": "add-items-to-cart,-validate-items-and-place-an-order;verify-successful-placement-of-any-order;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9290996833,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify successful placement of any order",
  "description": "",
  "id": "add-items-to-cart,-validate-items-and-place-an-order;verify-successful-placement-of-any-order;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User fills registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify registered user on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects \"Printed Summer Dress\" from homepage",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify selected product on the product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Verify \"Printed Summer Dress\" product on cart page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click on continue to shopping button on Cart page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User selects \"Printed Dress\" from homepage",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Verify selected product on the product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Verify \"Printed Dress\" product on cart page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User proceeds to checkout from Cart page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User verifies product details on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User clear cart on Summary page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "navigate to shopping screen",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User selects \"Faded Short Sleeve T-shirts\" from homepage",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User selects size of the dress on product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify \"Faded Short Sleeve T-shirts\" product on cart page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User click on continue to shopping button on Cart page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects \"Printed Summer Dress\" from homepage",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User selects size of the dress on product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Verify \"Printed Summer Dress\" product on cart page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User proceeds to checkout from Cart page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User verifies product details on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User clicks on proceed to checkout button on Summary page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Verify \"Billing Address\" address on Address confirmation page",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User clicks on proceed to checkout button on Address confirmation page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Verify terms of service on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User click on agree button on Shipping page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User click on proceed to checkout on Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify product details on Payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "select \"Pay by check\" as payment method on Payment page",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User clicks on confirm my order button on payment page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Verify order details on order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 272424542,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 4005674250,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.user_fills_registration_details()"
});
formatter.result({
  "duration": 6061414917,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyRegisteredUserOnHomepage()"
});
formatter.result({
  "duration": 35895209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.user_selects_from_homepage(String)"
});
formatter.result({
  "duration": 5338422875,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.verify_selected_item_on_item_detail_page()"
});
formatter.result({
  "duration": 365587667,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.user_adds_item_in_cart()"
});
formatter.result({
  "duration": 162782625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 8
    }
  ],
  "location": "CartPageSteps.verifyProductOnCartPage(String)"
});
formatter.result({
  "duration": 1123467125,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.user_continue_shopping_on_Order_page()"
});
formatter.result({
  "duration": 73412083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.user_selects_from_homepage(String)"
});
formatter.result({
  "duration": 7854685458,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.verify_selected_item_on_item_detail_page()"
});
formatter.result({
  "duration": 237171292,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.user_adds_item_in_cart()"
});
formatter.result({
  "duration": 80566041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 8
    }
  ],
  "location": "CartPageSteps.verifyProductOnCartPage(String)"
});
formatter.result({
  "duration": 1650584833,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.user_proceeds_to_checkout_from_Order_page()"
});
formatter.result({
  "duration": 1239895834,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_verifies_product_details_on_Summary_page()"
});
formatter.result({
  "duration": 529337084,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_clear_cart_on_Summary_page()"
});
formatter.result({
  "duration": 60873566500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clickOnLogo()"
});
formatter.result({
  "duration": 4812198125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.user_selects_from_homepage(String)"
});
formatter.result({
  "duration": 13429459000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_selects_size()"
});
formatter.result({
  "duration": 92780166,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.user_adds_item_in_cart()"
});
formatter.result({
  "duration": 78082792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 8
    }
  ],
  "location": "CartPageSteps.verifyProductOnCartPage(String)"
});
formatter.result({
  "duration": 3787653333,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.user_continue_shopping_on_Order_page()"
});
formatter.result({
  "duration": 93481792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.user_selects_from_homepage(String)"
});
formatter.result({
  "duration": 10419273125,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_selects_size()"
});
formatter.result({
  "duration": 89777625,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.user_adds_item_in_cart()"
});
formatter.result({
  "duration": 84161375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 8
    }
  ],
  "location": "CartPageSteps.verifyProductOnCartPage(String)"
});
formatter.result({
  "duration": 2723841709,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.user_proceeds_to_checkout_from_Order_page()"
});
formatter.result({
  "duration": 2077749958,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_verifies_product_details_on_Summary_page()"
});
formatter.result({
  "duration": 509588750,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_clicks_on_proceed_to_checkout_button_on_Summary_page()"
});
formatter.result({
  "duration": 2147815958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Billing Address",
      "offset": 8
    }
  ],
  "location": "AddressConfirmationSteps.verify_address_on_Address_confirmation_page(String)"
});
formatter.result({
  "duration": 778388167,
  "status": "passed"
});
formatter.match({
  "location": "AddressConfirmationSteps.user_clicks_on_proceed_to_checkout_button_on_Address_confirmation_page()"
});
formatter.result({
  "duration": 3853531250,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.verify_terms_of_service_on_Shipping_page()"
});
formatter.result({
  "duration": 31798792,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.user_click_on_agree_button_on_Shipping_page()"
});
formatter.result({
  "duration": 60864941375,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.user_click_on_proceed_to_checkout_on_Shipping_page()"
});
formatter.result({
  "duration": 1291325584,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.verify_product_details_on_Payment_page()"
});
formatter.result({
  "duration": 251635458,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay by check",
      "offset": 8
    }
  ],
  "location": "PaymentPageSteps.select_as_payment_method_on_Payment_page(String)"
});
formatter.result({
  "duration": 1022577417,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.user_clicks_on_confirm_my_order_on_payment_page()"
});
formatter.result({
  "duration": 2112220583,
  "status": "passed"
});
formatter.match({
  "location": "OrderConfirmationPageSteps.verifyOrderConfirmationDetails()"
});
formatter.result({
  "duration": 17075750,
  "status": "passed"
});
formatter.after({
  "duration": 171196167,
  "status": "passed"
});
});
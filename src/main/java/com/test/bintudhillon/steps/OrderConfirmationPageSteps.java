package com.test.bintudhillon.steps;

import com.test.bintudhillon.pages.OrderConfirmationPage;
import cucumber.api.java.en.Then;

public class OrderConfirmationPageSteps {
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @Then("^Verify order details on order confirmation page$")
    public void verifyOrderConfirmationDetails() {
        orderConfirmationPage.getOrderReferenceNumber();
    }

}

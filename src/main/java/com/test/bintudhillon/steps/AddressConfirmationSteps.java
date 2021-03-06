package com.test.bintudhillon.steps;

import com.test.bintudhillon.pages.AddressPage;
import cucumber.api.java.en.Then;

public class AddressConfirmationSteps {
    AddressPage addresspage = new AddressPage();

    @Then("^Verify \"([^\"]*)\" address on Address confirmation page$")
    public void verify_address_on_Address_confirmation_page(String addressType) {
        addresspage.verifyAddressOnAddressPage(addressType);
    }

    @Then("^User clicks on proceed to checkout button on Address confirmation page$")
    public void user_clicks_on_proceed_to_checkout_button_on_Address_confirmation_page() {
        addresspage.clickOnProceedToCheckOutbutton();
    }

}

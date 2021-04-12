package com.test.bintudhillon.steps;

import com.test.bintudhillon.pages.MyAccountPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountPageSteps {
    MyAccountPage myAccountPage = new MyAccountPage();

    @When("^User click on My Personal information$")
    public void view_personal_info() {
        myAccountPage.viewPeronalInfo();
    }

    @Then("^User navigates to your Personal information page$")
    public void verify_my_personal_info_page() {
        myAccountPage.verifyMyPersonalInforPage();
    }

    @Then("^User updates first name$")
    public void update_first_name() {
        myAccountPage.updateFirstName();
    }

    @Then("^User confirm updated changes$")
    public void confirm_updates() {
        myAccountPage.confirmUpdates();
    }

    @When("^Verify user details are updated")
    public void verify_updates() {
        myAccountPage.verifyUpdates();
    }
}
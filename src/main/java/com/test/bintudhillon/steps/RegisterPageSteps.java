package com.test.bintudhillon.steps;

import com.test.bintudhillon.pages.RegisterPage;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
    RegisterPage registerpage = new RegisterPage();

    @When("^User fills registration details$")
    public void user_fills_registration_details() {
        registerpage.registerUsingRandomData();
    }
}

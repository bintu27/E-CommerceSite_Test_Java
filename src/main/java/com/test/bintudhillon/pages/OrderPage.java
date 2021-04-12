package com.test.bintudhillon.pages;

import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;

import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    LoginPage loginpage = new LoginPage();

    public OrderPage() {
        PageFactory.initElements(getDriver(), this);
    }
}

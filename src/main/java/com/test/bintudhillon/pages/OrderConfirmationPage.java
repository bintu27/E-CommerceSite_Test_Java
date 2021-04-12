package com.test.bintudhillon.pages;

import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
    public OrderConfirmationPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//div[@class=\"box\"]/br[5]")
    private WebElement orderRefNumber;

    public void getOrderReferenceNumber() {
        orderRefNumber.getText();
    }
}

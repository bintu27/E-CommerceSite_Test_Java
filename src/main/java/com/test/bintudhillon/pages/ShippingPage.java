package com.test.bintudhillon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.bintudhillon.utils.AssertionUtils.assertPresent;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;

public class ShippingPage {
    public ShippingPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "iframe")
    private WebElement serviceTerms;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement checkBox;

    @FindBy(name = "processCarrier")
    private WebElement checkOutButton;

    public void verifyServiceTermsOnshippingPage() {
        assertPresent(serviceTerms);
    }

    public void clickOncheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnProceedToCheckOutbutton() {
        clickOnElement(checkOutButton);
    }

}

package com.test.bintudhillon.pages;

import static com.test.bintudhillon.utils.AssertionUtils.assertEquals;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;
import static com.test.bintudhillon.utils.WebElementUtils.waitForNotVisible;
import static com.test.bintudhillon.utils.WebElementUtils.waitForVisible;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "icon-ok")
    private WebElement productSuccessfullyadded;

    @FindBy(id = "layer_cart")
    private WebElement productConfiramationOverlay;

    @FindBy(id = "layer_cart_product_title")
    private WebElement productNameOnCart;

    @FindBy(xpath = "//span[@class='product-name']")
    private WebElement addedproductTocart;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElement continueShpBtn;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedBtn;

    public void verifyAddedProductToCartPage(String productName) {
        waitForVisible(productConfiramationOverlay);
        assertEquals(productNameOnCart, productName);
    }

    public void clickOnContinueShoppingbutton() {
        clickOnElement(continueShpBtn);
    }

    public void clickOnProceedToCheckoutbutton() {
        clickOnElement(proceedBtn);
    }
}

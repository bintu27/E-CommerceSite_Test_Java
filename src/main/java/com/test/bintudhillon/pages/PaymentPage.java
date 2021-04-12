package com.test.bintudhillon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.bintudhillon.utils.AssertionUtils.assertPresent;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;

public class PaymentPage {
    public PaymentPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='product-name']")
    private WebElement productName;
    @FindBy(xpath = "//small[@class='cart_ref']")
    private WebElement productModelNum;
    @FindBy(xpath = "//*[contains(text(),\"Size : M\")]")
    private WebElement productsize;
    @FindBy(xpath = "//span[@class='label label-success']")
    private WebElement productAvailability;
    @FindBy(xpath = "//*[@class='cart_unit']")
    private WebElement productUnitPrice;

    @FindBy(xpath = "//*[@class='cart_quantity text-center']")
    private WebElement productQty;
    @FindBy(xpath = "//*[contains(@id,'total_product_price')]")
    private WebElement productTotalPrice;
    @FindBy(id = "total_shipping")
    private WebElement shipingCost;

    @FindBy(id = "total_price_container")
    private WebElement totalPriceIncShipingCost;

    @FindBy(className = "bankwire")
    private WebElement bankwirePaymentMethod;

    @FindBy(css = "button[class='button btn btn-default button-medium']")
    private WebElement iConfirmMyOrderButton;

    public void verifyTheproductdetailsOnPaymentPage() {
        assertPresent(productName);
        assertPresent(productModelNum);
        assertPresent(productsize);
        assertPresent(productAvailability);
        assertPresent(productUnitPrice);
        assertPresent(productTotalPrice);
        assertPresent(shipingCost);
        assertPresent(productQty);
        assertPresent(totalPriceIncShipingCost);
    }

    public void clickOnPaymentMethod() {
        clickOnElement(bankwirePaymentMethod);
    }

    public void clickOnConfirmMyorder() {
        clickOnElement(iConfirmMyOrderButton);
    }
}

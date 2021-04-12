package com.test.bintudhillon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.test.bintudhillon.pages.ProductDetailsPage.items;
import static com.test.bintudhillon.utils.AssertionUtils.assertEquals;
import static com.test.bintudhillon.utils.AssertionUtils.assertPresent;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;
import static com.test.bintudhillon.utils.WebElementUtils.waitForVisible;

public class SummaryPage<productNameALL> {
    public SummaryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'step_')]")
    private List<WebElement> stepsList;

    @FindBy(xpath = "//*[@id='cart_summary']//th[contains(@class,'cart')]")
    private List<WebElement> tableheader;

    @FindBy(className = "heading-counter")
    private WebElement productsCountInTheCart;

    @FindBy(className = "alert alert-warning")
    private WebElement clearCartAlert;

    @FindBy(className = "cart_description")
    private WebElement productDescription;

    @FindBy(xpath = "//td[@class='cart_description']/p[@class='product-name']")
    private WebElement productName;

    @FindBy(xpath = "//td[@class='cart_description']/p[@class='product-name']")
    private List<WebElement> productNameALL;

    private WebElement productModelNum;
    @FindBy(xpath = "//td[@class='cart_description']//a[contains(text(),'Color : Orange, Size : S')]")
    private WebElement productcolorAndSize;
    @FindBy(xpath = "//span[@class='price' and contains(@id,'product_price')]")
    private WebElement productPrice;
    @FindBy(xpath = "//span[@class='price' and starts-with(@id,'product_price')]/span[1]")
    private List<WebElement> productPriceALL;
    @FindBy(xpath = "//*[contains(@class,'cart_quantity_input')]")
    private WebElement productQty;

    @FindBy(id = "total_product")
    private WebElement productTotalPrice;
    @FindBy(id = "total_shipping")
    private WebElement shippingcost;
    @FindBy(id = "total_price_without_tax")
    private WebElement totalPriceWithoutTax;
    @FindBy(id = "total_tax")
    private WebElement taxAmount;
    @FindBy(id = "total_price")
    private WebElement totalpriceAfterTax;

    @FindBy(xpath = "//ul[@class='address first_item item box']//*[@class='address_city']")
    private WebElement cityAndStateName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//*[@class='address_city']//following::li[1]")
    private WebElement countryName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_phone_mobile']")
    private WebElement deliveryaddressMobileNum;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_name']")
    private WebElement deliveryAddressName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_company']")
    private WebElement deliveryCompanyName;
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//span[contains(text(),'Proceed')]")
    private WebElement proceedTocheckOutbutton;

    @FindBy(className = "icon-trash")
    private List<WebElement> clearItem;

    public void verifyOrderedProductDetail() {
        verifyOrderPageElements();
        verifyProductDetailsONOrderpage();
        productBillingInfo();
        verifyDeliveryAddress();
    }

    public void verifyOrderPageElements() {
        waitForVisible(productsCountInTheCart);
        for (int i = 0; i < stepsList.size(); i++) {
            assertPresent(stepsList.get(i));
        }
        for (int j = 0; j < tableheader.size(); j++) {
            assertPresent(tableheader.get(j));
        }
    }

    public void verifyProductDetailsONOrderpage() {
        String expectedProductName, expectedProductPrice = null;
        int productCount = productNameALL.size();

        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<String> productPrice = new ArrayList<String>();
        for (int i = productCount; 0 < i; i--) {
            WebElement productNameElement = productNameALL.get(i - 1);
            WebElement productPriceElement = productPriceALL.get(i - 1);
            String productNameText = productNameElement.getText();
            String productPriceText = productPriceElement.getText();
            productName.add(productNameText);
            productPrice.add(productPriceText);
        }
        int i = 0;
        for (Map.Entry m : items.entrySet()) {
            Map<String, String> m1 = (Map<String, String>) m.getValue();
            if (!m1.isEmpty()) {
                Map.Entry<String, String> e = m1.entrySet().iterator().next();
                for (Map.Entry m2 : m1.entrySet()) {
                    if (m2.getKey() == "price") {
                        expectedProductPrice = (String) m2.getValue();
                    }
                }
            }
            expectedProductName = (String) m.getKey();
            String productNameValue = productName.get(i);
            String productPriceValue = productPrice.get(i);
            i++;

            assertEquals(productNameValue, expectedProductName);
            assertEquals(productPriceValue, expectedProductPrice);
        }
        items.clear();
        productName.clear();
        productPrice.clear();
    }

    public void productBillingInfo() {
        String actualSubTotal = totalPriceWithoutTax.getText().replace("$", "");
        float expectedTotal = Float.parseFloat(productTotalPrice.getText().replace("$", "")) + Float.parseFloat(shippingcost.getText().replace("$", ""));
        assertEquals(productPrice, actualSubTotal, String.valueOf(expectedTotal));

    }

    public void verifyDeliveryAddress() {
        assertEquals(cityAndStateName, System.getProperty("userdata.bean.city"));
        assertEquals(cityAndStateName, System.getProperty("userdata.bean.state"));
        assertEquals(countryName, System.getProperty("userdata.bean.country"));
    }

    public void proceedTocheckOut() {
        clickOnElement(proceedTocheckOutbutton);

    }

    public void clearCart() {
        int itemsToBeCleared = clearItem.size();
        for (int i = 0; i < itemsToBeCleared; i++) {
            WebElement client = clearItem.get(0);
            clickOnElement(client);
            waitForVisible(clearCartAlert);
        }
    }
}

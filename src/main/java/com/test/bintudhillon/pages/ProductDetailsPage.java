package com.test.bintudhillon.pages;

import com.test.bintudhillon.data.ProductDetailsBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.test.bintudhillon.utils.AssertionUtils.assertEquals;
import static com.test.bintudhillon.utils.AssertionUtils.assertPresent;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;

public class ProductDetailsPage {
    ProductDetailsBean productDetailsBean = new ProductDetailsBean();

    public ProductDetailsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@itemprop='name']")
    private WebElement productName;
    @FindBy(xpath = "//span[@itemprop=\"sku\"]")
    private WebElement productModel;
    @FindBy(id = "our_price_display")
    private WebElement productPrice;
    @FindBy(id = "reduction_percent_display")
    private WebElement productDiscount;
    @FindBy(id = "quantity_wanted")
    private WebElement productQty;
    @FindBy(id = "group_1")
    private WebElement productSize;
    @FindBy(xpath = "//select[@id='group_1']/option[@selected=\"selected\"]")
    private WebElement defaultSizeSelection;
    @FindBy(xpath = "//*[@id='color_to_pick_list']/li")
    private List<WebElement> productColorList;

    @FindBy(id = "add_to_cart")
    private WebElement addToCartBtn;

    public static Map<String, HashMap<String, String>> items = new TreeMap<String, HashMap<String, String>>();

    public void addItemDetails(String name,
                               String model,
                               String discount,
                               String price,
                               String qty,
                               String size,
                               String color) {
        HashMap<String, String> item_details = new HashMap<String, String>();
        item_details.put("model", model);
        item_details.put("discount", discount);
        item_details.put("price", price);
        item_details.put("qty", qty);
        item_details.put("size", size);
        item_details.put("color", color);
        items.put(name, item_details);
    }

    public void verifyProductDetailspage() {
        assertPresent(productName);
        assertPresent(productModel);
        assertPresent(productPrice);
        assertPresent(productQty);
        assertEquals(defaultSizeSelection, defaultSizeSelection.getAttribute("title"), "S");
        for (int i = 0; i < productColorList.size(); i++) {
            assertPresent(productColorList.get(i));
        }
        WebElement colorSelection = productColorList.get(0);
        Select selectedSize = new Select(productSize);
        WebElement productSelectedPrice = selectedSize.getFirstSelectedOption();
        addItemDetails(productName.getText(),
                productModel.getText(),
                productDiscount.getText(),
                productPrice.getText(),
                productQty.getText(),
                productSelectedPrice.getText(),
                colorSelection.getText());
    }

    public void addProductToTheCart() {
        clickOnElement(addToCartBtn);
    }
}

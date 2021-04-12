package com.test.bintudhillon.pages;

import static com.test.bintudhillon.utils.AssertionUtils.assertEquals;
import static com.test.bintudhillon.utils.AssertionUtils.assertPageTitle;
import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;
import static com.test.bintudhillon.utils.WebElementUtils.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement signInBtn;

    @FindBy(className = "account")
    private WebElement userNameText;

    @FindBy(xpath = "//*[@class='account']/span")
    private WebElement registeredUserName;

    @FindBy(id = "header_logo")
    private WebElement logoImage;

    @FindBy(id = "group_1")
    private WebElement selectSize;

    public void verifyUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }

    public void navigateToLoginPage() {
        clickOnElement(signInBtn);
    }

    public void verifyUserNameAfterLogin() {
        assertEquals(userNameText, userNameText.getText(), getPropertyByKey("loggedin.user"));
    }

    public void verifyUserAfterRegistration() {
        String expectedText = System.getProperty("userdata.bean.firstName") + " " + System.getProperty("userdata.bean.lastName");
        assertEquals(registeredUserName, expectedText);
    }

    public void clickOnlogo() {
        clickOnElement(logoImage);
    }

    public void selectItemFromHOmePage(String itemName) {
        clickOnElement(logoImage);
        WebElement itemNameElement = createDynamicLocator("//*[contains(text(),'%s')]", itemName);
        clickOnElement(itemNameElement);
    }

    public void selectSizeOnProductPage() {
        Select selectedSize = new Select(selectSize);
        selectedSize.selectByValue("2");
    }

}

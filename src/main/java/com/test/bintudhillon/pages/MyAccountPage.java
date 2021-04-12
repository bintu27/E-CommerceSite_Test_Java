package com.test.bintudhillon.pages;

import static com.test.bintudhillon.utils.CommonUtils.clickOnElement;
import static com.test.bintudhillon.utils.CommonUtils.sendKeysTo;
import static com.test.bintudhillon.utils.DriverUtils.getDriver;
import static com.test.bintudhillon.utils.AssertionUtils.assertPresent;

import org.junit.Assert;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "a[title = 'Information']")
    private WebElement personalInfo;
    @FindBy(xpath = "//*[@id='center_column']/div/h1")
    private WebElement personalInfoPage;
    @FindBy(id = "firstname")
    private WebElement updatedfirstName;
    @FindBy(css = "button[name='submitIdentity']")
    private WebElement saveUpdatedDetails;
    @FindBy(css = "[id='old_passwd']")
    private WebElement oldPassword;
    @FindBy(css = "p[class='alert alert-success']")
    private WebElement updatemessage;

    public void viewPeronalInfo() {
        clickOnElement(personalInfo);
    }

    public void verifyMyPersonalInforPage() {
        assertPresent(personalInfoPage);
    }

    public void updateFirstName() {
        sendKeysTo(updatedfirstName, RandomStringUtils.randomAlphabetic(2));
    }

    public void confirmUpdates() {
        sendKeysTo(oldPassword, getPropertyByKey("password"));
        clickOnElement(saveUpdatedDetails);
    }

    public void verifyUpdates() {
        Assert.assertEquals(String.format(getPropertyByKey("detailsupdated")), updatemessage.getText());
    }
}
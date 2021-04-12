package com.test.bintudhillon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.*;

import static com.test.bintudhillon.utils.ConfigUtils.getPropertyByKey;
import static com.test.bintudhillon.utils.ConfigUtils.loadProperties;

public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        String browserName = getPropertyByKey("browserName");
        switch (browserName) {
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "Edge":
                System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver");
                driver = new EdgeDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("application.url"));
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}

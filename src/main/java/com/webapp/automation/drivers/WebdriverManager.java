package com.webapp.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class WebdriverManager {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    public static void initializeDriver() throws MalformedURLException {
        if (getDriver() == null) {
            WebDriver driver = DriverFactory.initDriver();
            setDriver(driver);
        }
    }

    public static void quitDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }
}

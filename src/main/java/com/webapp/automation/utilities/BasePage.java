package com.webapp.automation.utilities;

import com.webapp.automation.drivers.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    protected void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    protected void enterText(By locator, String text) {
        WebElement inputField = driver.findElement(locator);
        inputField.sendKeys(text);
    }

    protected BasePage(){
        this.driver = WebdriverManager.getDriver();
    }
}

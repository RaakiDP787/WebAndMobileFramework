package com.test.webapps;

import com.webapp.automation.drivers.WebdriverManager;
import com.webapp.automation.pages.web.WebLoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class WebTests {

    @BeforeMethod
    public void setup() throws MalformedURLException {
        WebdriverManager.initializeDriver();
    }

    @Test()
    public void goToHomePage() {
        WebLoginPage.getInstance().goToHomePage();
    }

    @Test()
    public void searchProduct() {
        WebLoginPage.getInstance().searchProduct("Iphone");
    }

    @Test()
    public void goToCartPage() {
        WebLoginPage.getInstance().goToProductPage().goToCartPage();
    }

    @Test()
    public void goToCartPage2() {
        WebLoginPage.getInstance().goToProductPage().goToCartPage();
    }

    @AfterMethod
    public void tearDown() {
        WebdriverManager.quitDriver();
    }

}

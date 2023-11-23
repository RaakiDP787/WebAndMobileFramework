package com.test.webapps;

import com.webapp.automation.drivers.MobileDriverInitializer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MobileTests {
    AndroidDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = new MobileDriverInitializer().initializeMobileDriver();
    }

    @Test()
    public void loginTesting() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(AppiumBy.accessibilityId("test-Username")).sendKeys("standard_user");
        driver.findElement(AppiumBy.accessibilityId("test-Password")).sendKeys("secret_sauce");
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']/android.widget.TextView")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[Contains(text(),'PRODUCTS']")).isDisplayed();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

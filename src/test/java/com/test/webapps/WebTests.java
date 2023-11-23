package com.test.webapps;

import com.webapp.automation.cloud.SettingWeb;
import com.webapp.automation.drivers.DriverFactory;
import com.webapp.automation.drivers.WebDriverInitliazer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class WebTests {

        WebDriver driver;
        @BeforeMethod
        public void setup() throws MalformedURLException {
            //driver = DriverFactory.initDriver();
            driver = new WebDriverInitliazer().initializeWebDriver();
        }

        @Test()
        public void webTesting(){
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

    }

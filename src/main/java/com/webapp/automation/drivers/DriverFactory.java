package com.webapp.automation.drivers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class DriverFactory {

    public static WebDriver initDriver() throws MalformedURLException {
        WebDriver driver = null;
        String ENV = System.getProperty("environment");
        if(ENV.equals("MOBILE"))
        {
            driver = new MobileDriverInitializer().initializeMobileDriver();

        }else if(ENV.equals("WEB")){
            System.out.println(ENV);
            driver = new WebDriverInitliazer().initializeWebDriver();
        }
        return driver;
    }
}

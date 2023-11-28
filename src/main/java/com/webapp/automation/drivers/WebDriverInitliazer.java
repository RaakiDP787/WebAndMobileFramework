package com.webapp.automation.drivers;

import com.webapp.automation.cloud.SettingWeb;
import com.webapp.automation.enums.BrowserType;
import com.webapp.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.net.MalformedURLException;

public class WebDriverInitliazer {

    public WebDriver initializeWebDriver() throws MalformedURLException {
        
        WebDriver driver = null;

        Config config = new Config();

        if(config.getLocal().equals("true")) {
            if (config.getBrowserName().equals(BrowserType.CHROME.getPostfixName())) {
                driver = new ChromeDriver();
            } else if (config.getBrowserName().equals(BrowserType.FIREFOX.getPostfixName())) {
                driver = new FirefoxDriver();
            } else if (config.getBrowserName().equals(BrowserType.INTERNETEXPLORER.getPostfixName())) {
                driver = new InternetExplorerDriver();
            }
        }else
            driver = new SettingWeb().webCloudInitializer();
        
        return driver;
    }
}

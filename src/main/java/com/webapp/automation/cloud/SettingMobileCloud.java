package com.webapp.automation.cloud;

import com.webapp.automation.config.Config;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class SettingMobileCloud {

    public AndroidDriver setup() throws MalformedURLException {

        Config config = new Config();
        AndroidDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os_version", config.getBsMobileOsVersion());
        capabilities.setCapability("device", config.getBsMobileName());
        capabilities.setCapability("deviceName",config.getBsMobileName());
        capabilities.setCapability("app", config.getBsApp());
        capabilities.setCapability("browserstack.appium_version", "1.22.0");
        String username = config.getBsUserName();
        String accesskey = config.getBsAccessKey();
        final String url = "https://"+username+":"+accesskey+"@hub-cloud.browserstack.com/wd/hub";

        driver = new AndroidDriver(new URL(url), capabilities);

        return driver;

    }
}

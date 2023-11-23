package com.webapp.automation.cloud;

import com.webapp.automation.config.Config;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class SettingWeb {

    public RemoteWebDriver webCloudInitializer() throws MalformedURLException {

        Config config = new Config();

        RemoteWebDriver driver;
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "OS X");
        browserstackOptions.put("osVersion", "Big Sur");
        browserstackOptions.put("browserVersion", "latest");
        browserstackOptions.put("local", "false");
        browserstackOptions.put("seleniumVersion", "3.14.0");
        capabilities.setCapability("bstack:options", browserstackOptions);
        String username = config.getBsUserName();
        String accesskey = config.getBsAccessKey();
        final String url = "https://"+username+":"+accesskey+"@hub-cloud.browserstack.com/wd/hub";

        driver = new RemoteWebDriver(new URL(url), capabilities);
        return driver;
    }
}

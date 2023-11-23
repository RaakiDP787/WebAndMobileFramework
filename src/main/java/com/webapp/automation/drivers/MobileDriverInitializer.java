package com.webapp.automation.drivers;

import com.webapp.automation.cloud.SettingMobileCloud;
import com.webapp.automation.config.Config;
import com.webapp.automation.config.ConfigKeys;
import com.webapp.automation.config.MobileConfig;
import com.webapp.automation.utilities.BuildCapability;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverInitializer{

    public AndroidDriver initializeMobileDriver() throws MalformedURLException {

        AndroidDriver driver=null;
        Config config = new Config();
        final Capabilities capabilities = BuildCapability.buildCapabilities ();
        MobileConfig Mobileconfig = new MobileConfig();
        System.out.println(config.getCloud());

        if(config.getCloud().equals("false")) {
            try {
                driver = new AndroidDriver(new URL(Mobileconfig.getAppiumServerUrl()), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }else{
            driver = new SettingMobileCloud().setup();
        }
        return driver;
    }
}

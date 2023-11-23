package com.webapp.automation.utilities;

import com.webapp.automation.config.Config;
import com.webapp.automation.config.MobileConfig;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;

public class BuildCapability {

    public static Capabilities buildCapabilities() {
        MobileConfig config = new MobileConfig();
        final UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName(config.getPlatformName())
                .setPlatformVersion(config.getAndroidVersion())
                .setDeviceName(config.getDeviceName())
                .setAvd(config.getDeviceName())
                .setApp(config.getApkPath())
                .setAppPackage("com.swaglabsmobileapp")
                .setAppActivity("com.swaglabsmobileapp.MainActivity")
                .setAutoGrantPermissions(config.getAutoPermission().equals("true") ? true : false)
                .setIsHeadless(config.getHeadless().equals("true") ? true : false);
        return options;
    }
}
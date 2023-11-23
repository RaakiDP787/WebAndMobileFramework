package com.webapp.automation.config;

import com.webapp.automation.utilities.PropertyUtils;

public class MobileConfig extends PropertyUtils {
    private String deviceName;
    private String androidVersion;
    private String platformName;
    private String apkPath;
    private String headless;
    private String autoPermission;
    private String appiumServerUrl;

    public MobileConfig() {
        super();
        this.deviceName = getProperty(ConfigKeys.DEVICE_NAME, "");
        this.androidVersion = getProperty(ConfigKeys.ANDROID_VERSION,"");
        this.platformName = getProperty(ConfigKeys.PLATFORM_NAME,"");
        this.apkPath = getProperty(ConfigKeys.APK_PATH,"");
        this.headless = getProperty(ConfigKeys.HEADLESS,"");
        this.autoPermission = getProperty(ConfigKeys.AUTO_PERMISSION,"");
        this.appiumServerUrl = getProperty(ConfigKeys.APPIUM_SERVER_URL,"");

    }


    public String getAppiumServerUrl() {
        return appiumServerUrl;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getApkPath() {
        return apkPath;
    }

    public String getHeadless() {
        return headless;
    }

    public String getAutoPermission() {
        return autoPermission;
    }
}

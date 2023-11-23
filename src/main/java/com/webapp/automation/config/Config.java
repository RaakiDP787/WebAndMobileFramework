package com.webapp.automation.config;

import com.webapp.automation.utilities.PropertyUtils;
import lombok.Getter;
@Getter
public class Config extends PropertyUtils {
    private String browserName;
    private String bsUserName;
    private String bsAccessKey;
    private String bsMobileName;
    private String bsAppiumVersion;
    private String bsMobileOsVersion;

    public String getBsApp() {
        return bsApp;
    }

    private String bsApp;

    public String getLocal() {
        return local;
    }

    private String local;

    public String getCloudBrowserName() {
        return cloudBrowserName;
    }

    private String cloudBrowserName;

    public String getBsMobileName() {
        return bsMobileName;
    }

    public String getBsAppiumVersion() {
        return bsAppiumVersion;
    }

    public String getBsMobileOsVersion() {
        return bsMobileOsVersion;
    }

    public String getIsBSLocalEnabled() {
        return isBSLocalEnabled;
    }

    private String isBSLocalEnabled;

    public String getBsUserName() {
        return bsUserName;
    }

    public String getBsAccessKey() {
        return bsAccessKey;
    }

    public String getBrowserName() {
        return browserName;
    }


    public Config() {
        super();
        this.browserName = getProperty(ConfigKeys.BROWSER_NAME,"Chrome");
        this.bsUserName = getProperty(ConfigKeys.BROWSERSTACK_USERNAME,"");
        this.bsAccessKey = getProperty(ConfigKeys.BROWSERSTACK_ACCESS_KEY,"");
        this.bsMobileName = getProperty(ConfigKeys.BS_MOBILE_DEVICE_NAME,"");
        this.bsMobileOsVersion = getProperty(ConfigKeys.BS_MOBILE_OS_VERSION,"");
        this.bsAppiumVersion = getProperty(ConfigKeys.BS_APPIUM_VERSION,"");
        this.isBSLocalEnabled = getProperty(ConfigKeys.BS_LOCAL_ENABLED,"");
        this.cloudBrowserName = getProperty(ConfigKeys.BS_BROWSER_NAME,"");
        this.local = getProperty(ConfigKeys.LOCAL,"");
        this.bsApp = getProperty(ConfigKeys.BS_APP,"");
    }

}

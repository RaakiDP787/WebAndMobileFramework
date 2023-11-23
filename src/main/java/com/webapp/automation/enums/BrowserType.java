package com.webapp.automation.enums;

public enum BrowserType {

    CHROME("Chrome"),
    FIREFOX("Firefox"),
    INTERNETEXPLORER("InternetExplorer");

    private String postfixName;

    private BrowserType(String postfixName){
        this.postfixName = postfixName;
    }


    public String getPostfixName(){ return this.postfixName;}

}

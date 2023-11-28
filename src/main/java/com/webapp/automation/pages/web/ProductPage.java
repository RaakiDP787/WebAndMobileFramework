package com.webapp.automation.pages.web;

import com.webapp.automation.utilities.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private ProductPage(){
    }

    public static ProductPage getInstance(){
        return new ProductPage();
    }

    private static final By addToCartBtn = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
    private static final By placeOrderBtn = By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']");

    public void goToCartPage(){
        if(driver.findElement(addToCartBtn).isDisplayed()) {
            clickElement(addToCartBtn);
        }
        driver.findElement(placeOrderBtn);
    }
}

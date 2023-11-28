package com.webapp.automation.pages.web;
import com.webapp.automation.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
public class WebLoginPage extends BasePage {

    private static final By searchBox = By.xpath("//input[@class='Pke_EE']");
    private static final By searchButton = By.xpath("//button[@class='_2iLD__']");
    private static final By selectProduct = By.xpath("//div[@data-id='MOBFWBYZ8DNJNY7N']");
    private static final By sddToCartButton = By.id("add-to-cart-button");
    private static final By productURL = By.xpath("//div[@data-id='MOBFWBYZ8DNJNY7N']/div/a");
    private static final By loginPopupCloseBtn = By.xpath("//span[@class='_30XB9F']");

    private WebLoginPage(){
    }

    public static WebLoginPage getInstance(){
        return new WebLoginPage();
    }

    public void goToHomePage(){
        System.out.println("Opening the URL");
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        if(driver.findElement(loginPopupCloseBtn).isDisplayed()) {
            clickElement(loginPopupCloseBtn);
        }
    }

    public ProductPage goToProductPage(){
        searchProduct("Iphone");
        String ProductURL = driver.findElement(productURL).getAttribute("href");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(ProductURL);
        return ProductPage.getInstance();
    }

    public void searchProduct(String Searchtext){
        goToHomePage();
        enterText(searchBox,Searchtext);
        clickElement(searchButton);
    }
}
package com.saucedemo.aqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    private By menuLocator = By.id("react-burger-menu-btn");
    private By logoutLocator = By.id("logout_sidebar_link");
    private By pageTitleLocator = By.className("title");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage clickMenu(){
        driver.findElement(menuLocator).click();
        return this;
    }

    public String getPageTitle(){
        return driver.findElement(pageTitleLocator).getText();
    }

    public ProductsPage clickLogout(){
        driver.findElement(logoutLocator).click();
        return this;
    }
}

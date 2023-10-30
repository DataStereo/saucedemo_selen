package com.saucedemo.aqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By userNameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUserName(String text){
        driver.findElement(userNameLocator).sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text){
        driver.findElement(passwordLocator).sendKeys(text);
        return this;
    }

    public ProductsPage clickLogin(){
        driver.findElement(loginButtonLocator).click();
        return new ProductsPage(driver);
    }
}

package com.saucedemo.aqa.steps;

import com.saucedemo.aqa.pages.LoginPage;
import com.saucedemo.aqa.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.*;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password){
        loginPage = new LoginPage(driver);
        productsPage = loginPage.setUserName(username)
                .setPassword(password)
                .clickLogin();
        assertEquals(productsPage.getPageTitle(), "Products", "Login failed.");
        return this;
    }

    public UserSteps logout(){
        productsPage.clickMenu();
        productsPage.clickLogout();
        return this;
    }
}

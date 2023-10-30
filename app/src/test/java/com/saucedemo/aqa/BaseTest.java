package com.saucedemo.aqa;

import com.saucedemo.aqa.steps.UserSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    UserSteps userSteps;

    @BeforeTest
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1680, 1027));
        userSteps = new UserSteps(driver);
    }

    @AfterTest
    public void TearDown(){
        driver.close();
        driver.quit();
    }
}

package com.saucedemo.aqa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test(dataProvider = "userCredentials")
    public void loginTest(String userName, String password) {
        userSteps.login(userName, password)
                .logout();
    }

    @DataProvider
    public Object[][] userCredentials(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"visual_user", "secret_sauce"}
        };
    }
}

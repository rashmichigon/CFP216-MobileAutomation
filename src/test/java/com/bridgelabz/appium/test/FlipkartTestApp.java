package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.BaseClass;
import com.bridgelabz.appium.screen.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FlipkartTestApp extends BaseClass {

    LoginScreen loginScreen;

    @BeforeClass
    public void initDriver() throws MalformedURLException, InterruptedException
    {
        setUp();
        System.out.println("Flipkart launched successfully !!");
        loginScreen = new LoginScreen();
    }

    @Test
    public void createSession() throws InterruptedException
    {
        Boolean continueBtnEnabled = loginScreen.loginToFlipkart();
        Assert.assertEquals(continueBtnEnabled,true);
    }


}

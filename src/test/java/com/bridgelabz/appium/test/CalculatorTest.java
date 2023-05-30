package com.bridgelabz.appium.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    AndroidDriver driver;

    @BeforeClass
    public void createSession() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName","ccdb8802");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","11");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
        System.out.println("Calculator launched!!");
    }

    @Test
    public void handlingPlusCalcOperation(){
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        String text = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(text,"10", "Plus Operation Successfully Executed!!");
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

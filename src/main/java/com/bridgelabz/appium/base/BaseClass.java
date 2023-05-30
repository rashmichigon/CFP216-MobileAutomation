package com.bridgelabz.appium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseClass {

    public static AndroidDriver driver;

    public void setUp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","192.168.53.101:5555");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11.0");
        cap.setCapability("app","C:\\Users\\Admin\\IdeaProjects\\MobileAutomation_Project1\\src\\main\\resources\\Flipkart-7.18.apk");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        Thread.sleep(10000);
    }


}

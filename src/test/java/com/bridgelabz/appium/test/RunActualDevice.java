package com.bridgelabz.appium.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunActualDevice {

    AndroidDriver driver;

    @Test
    public void createSession() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","192.168.53.101:5555");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","8.1");
        //cap.setCapability("app","C:\\Users\\Admin\\Documents\\QADevPrograms\\CFPMobileAutomation\\src\\main\\resources\\chrome.apk");
        cap.setCapability("browserName", "chrome");
        //cap.setCapability("appPackage", "com.android.chrome");
        //cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        Thread.sleep(6000);
        driver.findElement(By.name("k")).sendKeys("Iphone");
        //driver.findElement(By.xpath("//*[@placeholder='Search Amazon']")).sendKeys("Iphone");
        Thread.sleep(3000);
        System.out.println("Amazon launched!!");
    }
}



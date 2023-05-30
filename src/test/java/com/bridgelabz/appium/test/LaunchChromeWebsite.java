package com.bridgelabz.appium.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchChromeWebsite {
    AndroidDriver driver;
    @Test
    public void createSession() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("app","C:\\Users\\Admin\\IdeaProjects\\MobileAutomation_Project1\\src\\main\\resources\\chrome.apk");
        //cap.setCapability("chromeDriverExecutable", "C:\Users\Admin\IdeaProjects\MobileAutomation_Project1\src\main\resources\chromedriver.exe");
        //cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

        capabilities.setCapability("autoGrantPermissions",true);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-search-keywords")).sendKeys("Iphone");
        System.out.println("Amazon website launched!!");
    }
}

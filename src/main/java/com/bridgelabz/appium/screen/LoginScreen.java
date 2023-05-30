package com.bridgelabz.appium.screen;

import com.bridgelabz.appium.base.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

public class LoginScreen extends BaseClass {

    public boolean loginToFlipkart() throws InterruptedException
    {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.flipkart.android:id/select_btn")).click();
        //clickContinueBtn.click();
        Thread.sleep(5000);
        //driver.findElement(AppiumBy.accessibilityId("Phone Number")).click();
        //driver.setClipboardText("Iphone 13");
        //driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText())
        //driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Phone Number\"]")).sendKeys("6712345670");
        //enterPhoneNo.sendKeys("6712345670");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
        Boolean flag  = driver.findElement(By.id("com.flipkart.android:id/button")).isEnabled();
        return flag;
    }

}

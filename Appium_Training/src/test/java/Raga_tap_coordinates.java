import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Raga_tap_coordinates extends  base_raga{

    public static void main(String[] args) throws MalformedURLException {

//        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort());
//        service.start();

        AndroidDriver<AndroidElement> driver = Capabilities();

        WebDriverWait wait = new WebDriverWait(driver,10);
        TouchAction t = new TouchAction(driver);



        //corner skip
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.raaga.android:id/skip_btn")));
        driver.findElementById("com.raaga.android:id/skip_btn").click();


        //skip again
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("android:id/button2")));
        driver.findElementById("android:id/button2").click();


        //use google accaunt
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.gms:id/account_profile_picture")));
        driver.findElementById("com.google.android.gms:id/account_profile_picture").click();


////        //exit
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.raaga.android:id/survey_partial_close_btn")));
//        driver.findElementById("com.raaga.android:id/survey_partial_close_btn").click();


        //corner menu
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.widget.ImageButton")));
        driver.findElementsByClassName("android.widget.ImageButton").get(0).click();

        //settings

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.CheckedTextView[@text='Settings']")));
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='Settings']").click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.raaga.android:id/switch_auto_play_recommendation")));
        //driver.findElementById("com.raaga.android:id/switch_auto_play_recommendation").click();


        //tap with coordinatest testing


        Point point = driver.findElementById("com.raaga.android:id/switch_auto_play_recommendation").getLocation();


        t.tap(PointOption.point(point.x +20, point.y +20)).perform();
        t.tap(PointOption.point(point.x +20, point.y +20)).perform();
        //t.tap(point.x +20, point.y +20).perform();

        // t.tap(point.x +20, point.y +20).perform();






    }





}

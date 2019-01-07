package TestPackage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.List;

import static io.appium.java_client.touch.offset.ElementOption.element;
//import static java.time.Duration.ofSeconds;

public class Raga_end_to_end extends  base_raga{


    @Test
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
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.raaga.android:id/iv_category_menu")));
        driver.findElementById("com.raaga.android:id/iv_category_menu").click();


        //scroll down and select tranding
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Trending\"));").click();


        //select song name Lets be friends
        //scroll will find nothing cause the song list ia always new
//        WebElement song =  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tanvi\"));");
//        t.longPress(longPressOptions().withElement(element(song)).withDuration(ofSeconds(2))).perform();

//        WebElement song =  driver.findElementsById("com.raaga.android:id/tv_song_title").get(2);
//
//        t.longPress(longPressOptions().withElement(element(song)).withDuration(ofSeconds(2))).release().perform();


        List<AndroidElement> song_list = driver.findElements(By.className("android.widget.TextView"));

        for (int i=0; i<song_list.size();i++) {

            if (song_list.get(i).getText().contains("Senorita"))
            {song_list.get(i).click();}

        }

    }

}

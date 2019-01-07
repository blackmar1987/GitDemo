import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.windows.WEmbeddedFrame;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gesture extends  base{

public static void main(String[] args) throws MalformedURLException {


    AndroidDriver<AndroidElement> driver = Capabilities();

    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

    WebDriverWait Wait = new WebDriverWait(driver, 100);

    Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Expandable Lists']")));

    TouchAction t = new TouchAction(driver);
    WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
    t.tap(tapOptions().withElement(element(expandlist))).perform();

    Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")));
    driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

    Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='People Names']")));
    WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");


    t.longPress(longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();

    System.out.println(driver.findElementById("android:id/title").isDisplayed());





}

    }


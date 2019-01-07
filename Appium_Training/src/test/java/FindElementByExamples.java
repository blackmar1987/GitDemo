import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class FindElementByExamples extends base {
    public static void main (String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        //The goal is to find Preference element and click on it
        //  xpath syntax
        //tagName[@attribute='value']

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

        WebDriverWait Wait = new WebDriverWait(driver, 100);

        Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")));


        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

        driver.findElement(By.id("android:id/checkbox")).click();

        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();


        driver.findElementByClassName("android.widget.EditText").sendKeys("password");

        driver.findElementById("android:id/button1").click();

        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.BACK);


        //driver.findElementByAndroidUIAutomator("attribute(\"value\")")

        System.out.println(driver.findElementByAndroidUIAutomator("text(\"Views\")").getAttribute("clickable"));
//        System.out.println(driver.findElementByAndroidUIAutomator("text(\"Views\")").getAttribute("bounds"));

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

    }




}

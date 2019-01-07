import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Scrolling extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();


        WebDriverWait wait = new WebDriverWait(driver,10);
        TouchAction t = new TouchAction(driver);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Views']"))));
        t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = 'Views']")))).perform();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");




    }
}

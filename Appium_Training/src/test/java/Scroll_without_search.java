import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Scroll_without_search extends  base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        TouchAction t = new TouchAction(driver);


        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Views']"))));
        t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = 'Views']")))).perform();


        Dimension size = driver.manage().window().getSize();
        int anchor, startPoint, endPoint;
        anchor = (int) (size.width * 0.5);
        startPoint = (int) (size.height * 0.6);
        endPoint = (int) (size.height * 0.1);
//        new TouchAction(driver).press(point(anchor, startPoint)).waitAction(waitOptions(Duration.ofMillis(5)))
//                .moveTo(point(anchor, endPoint)).release().perform();


//        TouchAction((AndroidDriver)driver).longPress(longPressOptions().withElement
//                ((ElementOption) point(xPoint, yPoint)).withDuration(Duration.ofMillis(duration))).release().perform();

//        new TouchAction(driver).longPress(point(anchor, endPoint))
//                .moveTo(point(anchor, startPoint)).release().perform();

//        new TouchAction(driver).press(point(anchor, endPoint)).waitAction(waitOptions(Duration.ofMillis(5)))
//                .moveTo(point(anchor, startPoint)).release().perform();


//        t.longPress(longPressOptions().withElement(element(fifteen)).withDuration(ofSeconds(2))).moveTo
//                (element(driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(9))).release().perform();


//
//   t.longPress(PointOption.point(anchor,endPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//           .moveTo(PointOption.point(anchor, startPoint))
//           .release()
//           .perform();
//

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Map<String, String> params = new HashMap<>();

        params.put("direction", "up");

        js.executeScript("mobile: swipe", params);


    }
}

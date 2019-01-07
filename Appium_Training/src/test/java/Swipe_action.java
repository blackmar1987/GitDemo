import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Swipe_action extends base {


    public static void main (String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        WebDriverWait wait = new WebDriverWait(driver,10);
        TouchAction t = new TouchAction(driver);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Views']"))));
        t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = 'Views']")))).perform();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Date Widgets']"))));
        t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = 'Date Widgets']")))).perform();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = '2. Inline']"))));
        t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = '2. Inline']")))).perform();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.widget.RadialTimePickerView$RadialPickerTouchHelper")));

        WebElement nine = driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(8);

        t.tap(tapOptions().withElement(element(nine))).perform();

//      nine.click();
//
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.widget.RadialTimePickerView$RadialPickerTouchHelper")));

        WebElement fifteen = driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(3);


        t.longPress(longPressOptions().withElement(element(fifteen)).withDuration(ofSeconds(2))).moveTo
                (element(driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(9))).release().perform();


    }
}

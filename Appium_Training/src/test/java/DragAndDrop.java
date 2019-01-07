import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragAndDrop extends base {

public static void main (String[] args) throws MalformedURLException{

    AndroidDriver<AndroidElement> driver = Capabilities();
    WebDriverWait wait = new WebDriverWait(driver,10);
    TouchAction t = new TouchAction(driver);

    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Views']"))));
    t.tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text = 'Views']")))).perform();

    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//android.widget.TextView[@text = 'Views']"))));
    driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

    WebElement Circle1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
   // WebElement Circle2 = driver.findElementById("io.appium.android.apis:id/drag_dot_2");

    t.longPress(longPressOptions().withElement(element(Circle1)).withDuration(ofSeconds(2))).release().perform();
    WebElement Circle2 = driver.findElementById("io.appium.android.apis:id/drag_dot_hidden");



    t.longPress(longPressOptions().withElement(element(Circle1)).withDuration(ofSeconds(2))).moveTo(element(Circle2)).release().perform();




}

}

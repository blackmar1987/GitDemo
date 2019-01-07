import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public  class EventsListener extends
        AbstractWebDriverEventListener {

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Searching for element by:" + by);
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Found element by:" + by);
    }


    public void beforeAlertAccept(WebDriver driver) {
        // Do nothing.
    }

    public void afterAlertAccept(WebDriver driver) {
        // Do nothing.
    }

    public void afterAlertDismiss(WebDriver driver) {
        // Do nothing.
    }

    public void beforeAlertDismiss(WebDriver driver) {
        // Do nothing.
    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        // Do nothing.
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        // Do nothing.
    }

    public void beforeNavigateBack(WebDriver driver) {
        // Do nothing.
    }

    public void afterNavigateBack(WebDriver driver) {
        // Do nothing.
    }

    public void beforeNavigateForward(WebDriver driver) {
        // Do nothing.
    }

    public void afterNavigateForward(WebDriver driver) {
        // Do nothing.
    }

    public void beforeNavigateRefresh(WebDriver driver) {
        // Do nothing.
    }

    public void afterNavigateRefresh(WebDriver driver) {
        // Do nothing.
    }



    public void beforeClickOn(WebElement element, WebDriver driver) {
        // Do nothing.
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        // Do nothing.
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        // Do nothing.
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        // Do nothing.
    }

    public void beforeScript(String script, WebDriver driver) {
        // Do nothing
    }

    public void afterScript(String script, WebDriver driver) {
        // Do nothing
    }

    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        // Do nothing
    }

    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        // Do nothing
    }

    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("Exception!!!" + throwable.getMessage());

        File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {

            Path copied = Paths.get("src/test/resources/test" + System.currentTimeMillis() + ".png");
            Path originalPath = tempFile.toPath();
            Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);


        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
        // Do nothing
    }

    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
        // Do nothing
    }

    public void beforeGetText(WebElement element, WebDriver driver) {
        // Do nothing
    }

    public void afterGetText(WebElement element, WebDriver driver, String text) {
        // Do nothing
    }




}

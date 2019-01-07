import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.NoSuchElementException;
import java.util.Set;

public class Extensions
{
    public static boolean IsElementPresentByTagName(WebDriver driver, By tagname)
    {


        try
        {
            driver.findElement(tagname);

            return true;
        }
        catch (NoSuchElementException ex)
        {
            //If element isn't found, set the timeout and return false
            return false;
        }
    }

    public static boolean IsElementPresentByXPath(WebDriver driver, By xpath)
    {


        try
        {
            driver.findElement(xpath);

            return true;
        }
        catch (NoSuchElementException ex)
        {
            //If element isn't found, set the timeout and return false
            return false;
        }
    }



    public static ExpectedCondition<String> anyWindowOtherThan(WebDriver driver, Set<String> windows) {
        return new ExpectedCondition<String>() {
            public String apply(WebDriver input) {
                Set<String> handles = driver.getWindowHandles();
                handles.removeAll(windows);
                return handles.size() > 0 ? handles.iterator().next() : null; } }; }


    public static boolean isDialogPresent(WebDriver driver) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            return true;
        } catch (UnhandledAlertException e) {
            // Modal dialog showed
            return false;
        }
    }





};
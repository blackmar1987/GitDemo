import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//1.	Copy code from “Task 3 : Create scenario which navigates through all sections on Admin page” into new class (e.g. Task 7)
//        2.	Add EventFiringWebDriver
//        3.	Add logging before and after find element
//        4.	Add screenshot capture on exceptions
//        5.	Optional: Execute scenario via RemoteWebDriver on local selenium server





public class Task7 {

    EventFiringWebDriver driver;

    @Before
    public void start() {
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventsListener());
    }

    @Test
    public void Task7() {


        //        1.	Login to admin panel http://localhost/litecart/admin
        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("remember_me")).click();
        driver.findElement(By.name("login")).click();


        //        2.	Open Countries (http://localhost/litecart/admin/?app=countries&doc=countries )

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box-apps-menu")));

        WebElement box_apps_menu_list = driver.findElement(By.className("list-vertical"));

        List<WebElement> list_of_apps = box_apps_menu_list.findElements(By.className("name"));

        System.out.println(list_of_apps.get(2).getText());
        list_of_apps.get(2).click();


        //        3.	Open on Edit any country or click “add new country”
        List<WebElement> dataTable = driver.findElements(By.className("dataTable"));
        driver.findElement(By.linkText("Afghanistan")).click();

//        4.	On Edit/New page some elements has arrow icon -
////        5.	Click on icon and wait until new window opened


        String originalW = driver.getWindowHandle();
        Set<String> existingWs = driver.getWindowHandles();

        driver.findElement(By.tagName("form")).findElement(By.tagName("a")).click();

        String newW = wait.until(Extensions.anyWindowOtherThan(driver, existingWs));
        driver.switchTo().window(newW);

        driver.close();

        driver.switchTo().window(originalW);

        List<WebElement> dataTableList = driver.findElement(By.tagName("form")).findElements(By.tagName("a"));

        int requiredNumber = 0;


        for (int a = 0; a < dataTableList.size(); a++) {
            System.out.println(a + " element = " + dataTableList.get(a).getText());


            if (dataTableList.get(a).getText().equalsIgnoreCase("?")) {
                System.out.println(dataTableList.get(a).getText());
                requiredNumber = a;

            }


        }

        dataTableList.get(requiredNumber).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        dataTableList.remove(requiredNumber);


        for (int a = 0; a < dataTableList.size(); a++) {
            dataTableList.get(a).click();

            String newW2 = wait.until(Extensions.anyWindowOtherThan(driver, existingWs));
            driver.switchTo().window(newW2);

            driver.close();

            driver.switchTo().window(originalW);


        }

        driver.findElement(By.id("notExistingID"));

    }
}
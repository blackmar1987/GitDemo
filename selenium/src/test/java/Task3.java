import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.xml.sax.Locator;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
/*
1.	Login to admin panel http://localhost/litecart/admin
2.	Sequentially click on each item in side menu (left) including all submenu items
3.	For each new page verify if header is present on the page (element h1)
* */

public class Task3 {

    WebDriver driver;

    @Before
        public void start(){


        ChromeOptions options = new ChromeOptions();
        options.setCapability("unexpectedAlertBeahviuor", "dismiss");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);


            ;}



    @Test
public void Task3() throws InterruptedException {

        System.out.println(((HasCapabilities) driver).getCapabilities());

        driver.get("http://localhost/litecart/en/login");



        WebElement username_form = driver.findElement(By.name("email"));
        username_form.sendKeys("blacmar1987@gmail.com");

        WebElement userpassword_form = driver.findElement(By.name("password"));
        userpassword_form.sendKeys("bendery");


        WebElement logginButton =  driver.findElement(By.name("login"));
        logginButton.click();

/*
    List<WebElement> li = driver.findElements(By.className("list-vertical"));
    li.get(0).click();

    Extensions.IsElementPresent(driver, By.tagName("h1"));


    WebElement customerServiceLink = driver.findElement(By.linkText("Customer Service"));
    customerServiceLink.click();


    Extensions.IsElementPresent(driver, By.tagName("h1"));
*/


    List<WebElement> li = driver.findElements(By.className("list-vertical"));
    int listSize = li.size();

    int a =0;



 while (a<listSize) {

        List<WebElement> whileList = driver.findElements(By.className("list-vertical"));
     System.out.println(whileList.size());
        System.out.println(a);
        //System.out.println(whileList.get(a).getAttribute("value"));
     System.out.println(driver.getCurrentUrl());
     System.out.println(whileList.get(a).getText());


        whileList.get(a).click();
        Thread.sleep(5000);

        Assert.assertTrue(Extensions.IsElementPresent(driver, By.tagName("h1")));
        Extensions.IsElementPresent(driver, By.tagName("h1"));

        a++;
    }




        //driver.quit();



}

    @After
    public void finish(){
        driver.quit();
        ;}

}



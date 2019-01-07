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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.nio.file.WatchEvent;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
/*
1.	Open main page (http://localhost/litecart)
2.	Select first product in Campaigns section
3.	Open Product Page (click on product)
4.	Verify that:
a.	Product Name is equal on Main page and on Item Page
b.	Prices (discount and regular) are equal on both pages
c.	Regular price is gray and strike ( ) on both pages
d.	Campaigns price is red and bold on both pages

Note: for color values you should just make sure that cssValue for color is the same as it shown in browser for the element.
Note color may not be equal on main and product pages)

* */

public class Task4 {

    WebDriver driver;

    @Before
    public void start(){


        ChromeOptions options = new ChromeOptions();
        options.setCapability("unexpectedAlertBeahviuor", "dismiss");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);


        ;}



    @Test
    public void Task4() throws InterruptedException {

        driver.get("http://localhost/litecart/en/");


        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box-campaigns")));


        WebElement campaignsDiv = driver.findElement(By.id("box-campaigns"));

        String manePageProductName =  campaignsDiv.findElement(By.className("name")).getText();

        System.out.println(manePageProductName);


        String manePageProductRegularPrice =  campaignsDiv.findElement(By.className("regular-price")).getText();
        System.out.println(manePageProductRegularPrice);

        String manePageProductRegularPriceColor =  campaignsDiv.findElement(By.className("regular-price")).getCssValue("color");
        System.out.println(manePageProductRegularPriceColor);


        String manePageProductDiscountPrice =  campaignsDiv.findElement(By.className("campaign-price")).getText();
        System.out.println(manePageProductDiscountPrice);

        String manePageProductDiscountPriceColor =  campaignsDiv.findElement(By.className("campaign-price")).getCssValue("color");
        System.out.println(manePageProductDiscountPriceColor);

        String manePageProductDiscountPriceWeight =  campaignsDiv.findElement(By.className("campaign-price")).getCssValue("font-weight");
        System.out.println(manePageProductDiscountPriceWeight);




        WebElement yellowDuckLink = campaignsDiv.findElement(By.className("link"));

        yellowDuckLink.click();

       Assert.assertTrue(manePageProductName.equalsIgnoreCase(driver.findElement(By.id("box-product")).findElement(By.className("title")).getText()));

        /*
        WebElement boxProductDiv = driver.findElement(By.id("box-product"));

        String boxProductPageProductName =  boxProductDiv.findElement(By.className("title")).getText();

        System.out.println(manePageProductName);

*/



        Assert.assertTrue(manePageProductRegularPrice.equalsIgnoreCase(driver.findElement(By.id("box-product")).findElement(By.className("regular-price")).getText()));
        Assert.assertTrue(manePageProductDiscountPrice.equalsIgnoreCase(driver.findElement(By.id("box-product")).findElement(By.className("campaign-price")).getText()));

        WebElement boxProductDiv = driver.findElement(By.id("box-product"));

        String boxProductPageRegularPriceColor =  boxProductDiv.findElement(By.className("title")).getCssValue("color") ;

        System.out.println(boxProductPageRegularPriceColor);

        try {
            Assert.assertEquals(manePageProductRegularPriceColor, boxProductPageRegularPriceColor);
        } catch (AssertionError error) {
            System.out.println("Regular price is gray  ( ) on both pages - FAILED");
        };



        try {
            Assert.assertEquals(manePageProductDiscountPriceWeight, driver.findElement(By.id("box-product")).findElement(By.className("campaign-price")).getCssValue("font-weight"));
        } catch (AssertionError error) {
            System.out.println("Campaigns price is  bold on both pages - FAILED");
        };

/*
        Assert.assertTrue(manePageProductRegularPriceColor.equalsIgnoreCase(driver.findElement(By.id("box-product")).findElement(By.className("regular-price")).getCssValue("color") ));

        Assert.assertTrue(manePageProductDiscountPriceColor.equalsIgnoreCase(driver.findElement(By.id("box-product")).findElement(By.className("campaign-price")).getCssValue("color")));

*/






    }



    @After
    public void finish(){
        driver.quit();
        ;}



}



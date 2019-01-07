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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.security.spec.ECParameterSpec;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
1.	Open main page
2.	Open first product from the list
3.	Add the product to the cart (the product may already be present in the cart, it’s ok)
4.	Wait until counter of the items in the cart changes
5.	Back to the main page and repeat steps 1-4 twice to have overall 3 items in the cart
6.	Open the Cart (click Checkout at right-top)
7.	Remove all products from the cart one-by-one. After each removal wait until table at the bottom of the page refreshed
8.	Verify that 0 items in the cart after removal


 */


public class Task52 {

    WebDriver driver ;

    @Before
    public  void start() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("unexpectedAlertBeahviuor", "dismiss");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
    }

    @Test
    public void Task52(){
        driver.get("http://localhost/litecart/en/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement boxmostpopular  = driver.findElement(By.id("box-most-popular"));

        WebElement content = boxmostpopular.findElement(By.className("content"));


    //    List <WebElement> link = content.findElements(By.className("listing-wrapper"));
        List <WebElement> link = content.findElements(By.className("products"));

//        for(int i=0; i<link.size(); i++){
//
//            System.out.println(i + " " +link.get(i));
//
//        }


link.get(0).click();



       //  List <WebElement> List = driver.findElements(By.className("listing-wrapper products"));

       // List<WebElement> whileList = driver.findElements(By.className("list-vertical"));

        WebElement quantity = driver.findElement(By.className("quantity"));

        System.out.println(quantity.getText());

        int quantityInt = Integer.parseInt(quantity.getText());
        int test = quantityInt+3;

        while(quantityInt<test) {

            driver.findElement(By.name("add_cart_product")).click();
            String newquantity = Integer.toString(quantityInt+1);

            WebDriverWait wait2 = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.textToBe(By.className("quantity"), newquantity));
            quantityInt++;

        }

        WebElement checkout = driver.findElement(By.id("cart-wrapper"));
        checkout.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("remove_cart_item")));


        WebElement quantityInput = driver.findElement(By.name("quantity"));

        int quantityBeforeRemove = Integer.parseInt(quantityInput.getAttribute("value"));

        int i=2;
        while(quantityBeforeRemove>0) {

            String newquantity = Integer.toString(quantityBeforeRemove-1);

            System.out.println("quantityBeforeRemove = " + quantityBeforeRemove);
            System.out.println("newquantity = " + newquantity);

            WebDriverWait wait4 = new WebDriverWait(driver, 10);
            wait4.until(ExpectedConditions.presenceOfElementLocated(By.name("quantity")));

            driver.findElement(By.name("quantity")).clear();

          driver.findElement(By.name("quantity")).sendKeys(newquantity);
           // driver.findElement(By.name("quantity")).sendKeys(Integer.toString(i));

            driver.findElement(By.name("update_cart_item")).click();

            WebDriverWait wait3 = new WebDriverWait(driver, 10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.name("quantity")));

          wait.until(ExpectedConditions.attributeToBe(By.name("quantity"), "value", newquantity));


            System.out.println("quaintity after update = " + Integer.parseInt(driver.findElement(By.name("quantity")).getAttribute("value")));

            quantityBeforeRemove--;

        }





        ;}




//    @After
//    public  void finish(){
//    driver.quit();
//    }


}

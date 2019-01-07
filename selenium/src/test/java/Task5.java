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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.util.List;


/*
1.	Login to admin panel http://localhost/litecart/admin
2.	Open Catalog (Left menu)
3.	Click “Add New Product” (right top)
4.	Fill all fields on General, Information and Prices tabs (all other tabs as well as Campaigns on Prices may not be filled)

Note: Please put file with the image to the project (resource) folder. To convert local file path to absolute, you can use following code snippet:

ClassLoader classLoader = getClass().getClassLoader();
File file = new File(classLoader.getResource("image.png").getFile());
fileField.sendKeys(file.getAbsolutePath());

Note: Item’s name should be unique each time you run the tests, you can use current time in milliseconds or generate UUID’s to create prefixes

5.	Save the Product
6.	Make sure that new product appeared in catalog (on admin page, client page verification is not necessary)

 */


public class Task5 {

    WebDriver driver ;

@Before
public  void start() {
    ChromeOptions options = new ChromeOptions();
    options.setCapability("unexpectedAlertBeahviuor", "dismiss");
    options.addArguments("start-maximized");

    driver = new ChromeDriver(options);
}

    @Test
    public void Task5(){
    driver.get("http://localhost/litecart/admin");

    WebDriverWait wait = new WebDriverWait(driver, 10);

    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("remember_me")).click();
    driver.findElement(By.name("login")).click();

    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box-apps-menu")));

        WebElement box_apps_menu_list = driver.findElement(By.className("list-vertical"));

        List<WebElement> list_of_apps = box_apps_menu_list.findElements(By.className("name"));

        System.out.println(list_of_apps.get(1).getText());
        list_of_apps.get(1).click();



//        WebElement content = driver.findElement(By.className("content"));
//        List <WebElement> addButtonsDiv = content.findElements(By.tagName("div"));
//
//        System.out.println(addButtonsDiv);
//
//        //new Actions(driver).moveToElement(addButtonsDiv, 12, 12).click().build().perform();


        WebElement content = driver.findElement(By.className("fa-question-circle"));
        //new Actions(driver).moveToElement(content).click().perform();
       new Actions(driver).moveToElement(content).moveByOffset(-50,-12).click().build().perform();
        //new Actions(driver).moveToElement(content,-50,0).contextClick();







    ;}




//    @After
//    public  void finish(){
//    driver.quit();
//    }


}

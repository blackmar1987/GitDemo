import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;


public class Test_Chrome {

//    public WebDriver driver;

    @Test
    public void testIncorrectFBLogin() throws Exception{
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_Test");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//        System.setProperty("webdriver.chrome.driver", "d:\\JAVA+HTML\\JAVA\\Appium_test\\chromedriver.exe");


//        System.setProperty("chromedriverExecutableDir", "d:\\JAVA+HTML\\JAVA\\Appium_test\\chromedriver.exe");


//        ChromeDriverManager.getInstance(CHROME).setup();



        System.out.println("Step 1. Create new driver");
        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("Step 2. Open website");
        driver.get("http://ek.ua/");

        System.out.println("Step 3. Enter search value");
        driver.findElement(By.name("search_")).sendKeys("GeForce");

        System.out.println("Step 4. Click Search button");
        driver.findElement(By.name("search_but_")).click();

        Thread.sleep(5000);
        System.out.println("Step 5. Check result");

        String expectedResult = "Видеокарты NVIDIA (все модели) ";
        String actualResult = driver.findElement(By.className("t2")).getText();
        Boolean resultCheck = driver.findElement(By.className("t2")).getText().contains(expectedResult);

        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
        System.out.println("Check result: " + resultCheck);

        Assert.assertTrue(driver.findElement(By.className("t2")).getText().contains(expectedResult));

        System.out.println("Step 6. Close driver");
        driver.quit();
    }
}

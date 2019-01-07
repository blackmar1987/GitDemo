import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

    @Test
    public void firstTest() {
//        System.setProperty("webdriver.chrome.driver","C:chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", ".....AppData/Local/Google/Chrome/Application/chrome.exe");

//        System.setProperty("webdriver.chrome.driver", "c:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\ChromeDriver\\geckodriver.exe" );
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        System.out.println(driver.getTitle());


    }


}
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

@Test
public void firstTest() {
    //System.setProperty("webdriver.chrome.driver","C:chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost/litecart/admin");

    driver.findElement(By.name("login_form"));



    driver.quit();
}


}

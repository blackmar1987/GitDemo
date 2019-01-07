import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.plugin2.os.windows.Windows;

import java.net.MalformedURLException;
import java.net.URL;

public class Vinium {

    WebDriver driver;


    @Before
    public  void start() throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("app", "c:\\Windows\\system32\\calc.exe");
        caps.setCapability("app", "C:\\Windows\\System32\\mspaint.exe");
//        caps.setCapability("app", "C:\\Program Files (x86)\\Microsoft Office\\Office12\\EXCEL.EXE");
//        caps.setCapability("app", "C:\\Users\\Sasha\\AppData\\Local\\Viber\\Viber.exe");






        driver = new RemoteWebDriver(new URL("http://192.168.56.1:9999"), caps);

    }


    @Test
    public void test(){

        WebElement text = driver.findElement(By.name("Text"));
        new Actions(driver).moveToElement(text).click().perform();




    }

}

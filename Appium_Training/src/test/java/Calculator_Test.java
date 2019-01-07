import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.util.locale.provider.SPILocaleProviderAdapter;

import java.net.URL;

public class Calculator_Test {


    @Test
    public void testIncorrectFBLogin() throws Exception{
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");

        //real device
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TA3940072J");


//        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");




        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 30);



        driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();


        System.out.println(driver.findElement(By.xpath("\t/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText());



        Assert.assertEquals(driver.findElement(By.id("com.android.calculator2:id/result")).getText(), "16");








    }

}

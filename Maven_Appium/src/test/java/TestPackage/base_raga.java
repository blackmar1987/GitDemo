package TestPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base_raga {


    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {


        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

        File f = new File("src");
        File fs = new File(f, "Raga.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");;
        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver(serverURL, capabilities);

        return driver;


    }

}

package Suite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Suite {


    @BeforeSuite
    public void Suite()
    {
        //This opens the Browser
        System.out.println("Before suite");
    }

    @Test
    public void OpeningBrowser()
    {
        //This opens the Browser
        System.out.println("test1");
    }


    @BeforeSuite
    public void AfterSuite()
    {
        //This opens the Browser
        System.out.println("After suite");
    }

}

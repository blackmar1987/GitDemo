import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {



    @BeforeTest
    public void BeforeTest(){
        System.out.println("From First");
    }

    @Test
public void Test(){
    System.out.println("From First");
}

}

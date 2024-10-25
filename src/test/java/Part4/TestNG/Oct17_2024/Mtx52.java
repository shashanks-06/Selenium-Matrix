package Part4.TestNG.Oct17_2024;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mtx52 {

    @Test
    public void test(){     // Always Non-Static Method is used in TestNG
        Reporter.log("Testing using TestNG", true);
    }

    @Test
    public void TC1(){
        Reporter.log("Running from TC1", true);
    }

    @Test
    public void TC2(){
//        Assert.fail();  // To intentionally fail
        Reporter.log("Running from TC2", true);
    }
}

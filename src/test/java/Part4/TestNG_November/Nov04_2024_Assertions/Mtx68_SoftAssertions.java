package Part4.TestNG_November.Nov04_2024_Assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Mtx68_SoftAssertions {

    @Test
    public void TC_Soft(){

        SoftAssert softAssert = new SoftAssert();   //  Soft Assert class object is created

        System.out.println("Step 1");
        softAssert.assertTrue(false);

        System.out.println("Step 2");
        softAssert.assertTrue(false);

        System.out.println("Step 3");
        softAssert.assertTrue(true);

        softAssert.assertAll(); // It is IMPORTANT as even if other assertions fails the test method will still pass
    }
}

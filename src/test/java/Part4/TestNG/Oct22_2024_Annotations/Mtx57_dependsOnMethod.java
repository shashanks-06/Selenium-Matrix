package Part4.TestNG.Oct22_2024_Annotations;

import org.testng.annotations.Test;

public class Mtx57_dependsOnMethod {

    @Test(dependsOnMethods = {"testCase2", "testCase3"})
    public void testCase1(){
        System.out.println("Mobile Login Test Case");
    }

    @Test
    public void testCase2() throws InterruptedException {
//        Assert.assertTrue(false);   // To  intentionally fail
//        Assert.fail();              // To  intentionally fail
        System.out.println("Web Login Test Case");
    }

    @Test
    public void testCase3(){
//        Assert.fail();          // To  intentionally fail
        System.out.println("API Login Test Case");
    }
}

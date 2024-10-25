package Part4.TestNG.Oct21_2024_Annotations;

import org.testng.annotations.Test;

public class Mtx56 {

    @Test(description = "This is Test Case 1", priority = 2)
    public void testCase1(){
        System.out.println("Mobile Login Test Case");
    }

//    "priority = 0" means that the test case will run first

    @Test(description = "This is Test Case 2" , timeOut = 200, priority = 0)
    public void testCase2() throws InterruptedException {
//        Thread.sleep(400);  // It will fail
        System.out.println("Web Login Test Case");
    }

    @Test(description = "This is Test Case 3", priority = 1)
    public void testCase3(){
        System.out.println("API Login Test Case");
    }

    @Test
    public void testCase4(){
        System.out.println("This TestCase will run after 'priority = 0' but before 'priority = 1'.");
    }
}

package Part4.TestNG_November.Nov04_2024_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mtx67_HardAssertions {
    @Test
    public void test1(){
        String actual = "Mumbai";
        String expected = "Pune";

        boolean boolValue = true;
//        boolean boolValue = false;

//        Assert.assertEquals(actual, expected);
//        Assert.assertNotEquals(actual, expected);
        Assert.assertTrue(boolValue);

        System.out.println("Test1 Program Run Successfully");
    }

    @Test
    public void test2(){
        System.out.println("Running Test2 Program");
//        Assert.assertTrue(false);
//        Assert.assertFalse(true);
        Assert.fail();
        System.out.println("Test2 Program Run Successfully");
    }

    @Test
    public void test3(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        System.out.println("Test3 Program Run Successfully");
    }
}

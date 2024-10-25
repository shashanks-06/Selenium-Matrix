package Part4.TestNG.Oct23_2024_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mtx60_Parameter1 {

    @Parameters("Automobile Company")
    @Test
    public void testCase1(String name){
        System.out.println(name);
    }
}

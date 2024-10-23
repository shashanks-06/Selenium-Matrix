package Part4_TestNG.Sel8.Oct23_2024_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mtx60_Parameter2 {

    @Parameters("Software Company")
    @Test
    public void testCase2(String name){
        System.out.println(name);
    }
}

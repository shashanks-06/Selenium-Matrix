package Part4.TestNG.Oct22_2024_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mtx59_parameters {

    @Test
    @Parameters( {"i", "j"} )
    public void add(int a, int b){
        System.out.println("Addition : " + (a+b));
    }

    @Test
    @Parameters( {"i", "j"} )
    public void subtract(int a, int b){
        System.out.println("Subtraction : " + (a-b));
    }

    @Test
    @Parameters( {"i", "j"} )
    public void multiply(int a, int b){
        System.out.println("Multiplication : " + (a*b));
    }

    @Test
    @Parameters( {"i", "j"} )
    public void divide(int a, int b){
        System.out.println("Divide : " + (a/b));
    }
}

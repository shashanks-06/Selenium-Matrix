package Part4.TestNG.Oct22_2024_Annotations;

import org.testng.annotations.Test;

public class Mtx58_groups {

    @Test(groups = "Software Company")
    public void infosys(){
        System.out.println("Infosys");
    }

    @Test(groups = "Software Company")
    public void accenture(){
        System.out.println("Accenture");
    }

    @Test(groups = "Automobile Company")
    public void tata(){
        System.out.println("Tata");
    }

    @Test(groups = "Automobile Company")
    public void mahindra(){
        System.out.println("Mahindra");
    }
}

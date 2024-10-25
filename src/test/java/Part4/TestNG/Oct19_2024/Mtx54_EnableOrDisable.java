package Part4.TestNG.Oct19_2024;

import org.testng.annotations.Test;

public class Mtx54_EnableOrDisable {

//    Personal Loan
    @Test           // Disable this method through xml file
    public void mobileLoginPersonalLoan(){
        System.out.println("Mobile Login Personal Loan");
    }

    @Test
    public void webLoginPersonalLoan(){
        System.out.println("Web Login Personal Loan");
    }

    @Test(enabled = true) // To enable  -> Not compulsory to add this annotation
//    @Test(enabled = false) // To disable
    public void apiLoginPersonalLoan(){
        System.out.println("API Login Personal Loan");
    }

    //    Automobile Loan
    @Test(enabled = false)      // To disable
    public void mobileLoginAutomobileLoan(){
        System.out.println("Mobile Login Automobile Loan");
    }

    @Test
    public void webLoginAutomobileLoan(){
        System.out.println("Web Login Automobile Loan");
    }

    @Test
    public void apiLoginAutomobileLoan(){
        System.out.println("API Login Automobile Loan");
    }
}

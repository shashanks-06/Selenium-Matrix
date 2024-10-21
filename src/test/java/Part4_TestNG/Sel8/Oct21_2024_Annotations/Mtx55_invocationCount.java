package Part4_TestNG.Sel8.Oct21_2024_Annotations;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mtx55_invocationCount {

    @Test (invocationCount = 5)
    public void TC1(ITestContext iTestContext){
        int currentInvocationCount = iTestContext.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Executing from TC1 : " + currentInvocationCount);
        Reporter.log("Running from TC1", true);
    }


    @Test(invocationCount = 2)          // (invocationCount = 0) -> to not run
    public void TC2(ITestContext iTestContext){
        int currentInvocationCount = iTestContext.getAllTestMethods()[1].getCurrentInvocationCount();
        System.out.println("Executing from TC2 : " + currentInvocationCount);
        Reporter.log("Running from TC2", true);
    }
}

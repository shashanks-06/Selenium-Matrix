package Part4.TestNG.Oct28_2024_TestNgListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ITestListener class is a listener to monitor the event of test Execution
public class Mtx65_Listeners implements ITestListener {

//    This method invoked before all the test methods will run
    public void onStart(ITestContext result){
        System.out.println("onStart() -> On Start method Invoked: " + result.getName());
        System.out.println();
    }

    //    This method invoked when everytime method is called and executed
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart() -> Name of the Test Method started : " + result.getName());
        System.out.println();
    }

    //    This method invoked when everytime method is passes or succeeded executed
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess() -> Name of the Test Method succeeded : " + result.getName());
        System.out.println();
    }

    //    This method invoked when everytime test skipped
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped() -> Name of the Test Method skipped : " + result.getName());
        System.out.println();
    }

    //    This method invoked when everytime test fails
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure() -> Name of the TestMethod  failed : " + result.getName());
        System.out.println();
    }

    //    This method invoked when everytime method is Failed But Within Success Percentage
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Name of the Test Method Failed But Within Success Percentage : " + result.getName());
        System.out.println();
    }

    //    This method invoked when all the test methods have run
    public void onFinish(ITestContext result){
        System.out.println("onFinish() -> On Finish Method Invoked");
        System.out.println();
    }


}

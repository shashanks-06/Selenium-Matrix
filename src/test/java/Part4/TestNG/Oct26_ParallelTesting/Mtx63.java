package Part4.TestNG.Oct26_ParallelTesting;

import org.testng.annotations.Test;

public class Mtx63 {

    @Test
    public void method1() throws InterruptedException {
        System.out.println("This is Method1");
        Thread.sleep(2000);
    }

//  Both methods will run at the same time -> parallel -> <parallel="methods" thread-count="2"> in Mtx64_testng.xml

    @Test
    public void method2() throws InterruptedException {
        System.out.println("This is Method2");
        Thread.sleep(2000);
    }
}

package Part4.TestNG.Nov05_2024_Annotations;

import org.testng.annotations.*;

public class Mtx69_1 {

    @BeforeSuite
    public void test_BeforeSuite() {
        System.out.println("@BeforeSuite -> Run once BEFORE Suite...\n");
    }


    @BeforeTest
    public void test_BeforeTest(){
        System.out.println("@BeforeTest -> Run once BEFORE Test...\n");
    }

    @BeforeClass
    public void test_BeforeClass(){
        System.out.println("@BeforeClass -> Run once BEFORE Class...\n");
    }


    @BeforeMethod
    public void test_beforeMethod(){
        System.out.println("@BeforeMethod -> Run BEFORE every Method...");
    }

    @Test
    public void TC01(){
        System.out.println("Running TC01 Method...");
    }

    @Test
    public void TC02(){
        System.out.println("Running TC02 Method...");
//        Reporter.log("Running TC02 Method...");      // This will not get Print
    }

    @AfterMethod
    public void test_afterMethod(){
        System.out.println("@AfterMethod -> Run AFTER Every Method...\n");
    }


    @AfterClass
    public void test_AfterClass(){
        System.out.println("@AfterClass -> Run once AFTER Class...\n");
    }

    @AfterTest
    public void test_AfterTest(){
        System.out.println("@AfterTest -> Run once After Test...");
    }


    @AfterSuite
    public void test_AfterSuite() {
        System.out.println("@AfterSuite -> Run once After Suite...\n");
    }
}

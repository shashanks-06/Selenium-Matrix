package Part4.TestNG_November.Nov07_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mtx71_AddAndSearch {

    WebDriver driver;
    String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("@BeforeTest -> setUp function Executed\n");
    }

    @Test
    public void loginOrangeHrm() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        String expectedTitle = driver.getTitle();

        Assert.assertEquals("OrangeHRM",expectedTitle);

        System.out.println("Login Successfully");
        System.out.println("Page Title is " + expectedTitle);
    }


    @Test(dependsOnMethods = "loginOrangeHrm")
    public void addEmployee() throws InterruptedException {

//        Click on "PIM"
        driver.findElement(By.xpath("//span[normalize-space()=\"PIM\"]")).click();
        Thread.sleep(2000);

//        Click on "Add Employee"
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("James");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");

//      change the id always for successful testing
        driver.findElement(By.xpath(
                "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"))
                .sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        String finalName = driver.findElement(By.xpath("//h6[normalize-space()='John Doe']")).getText();

        Assert.assertEquals(finalName, "John Doe");

        System.out.println("Employee Added Successfully");
    }

    @Test(dependsOnMethods = "addEmployee")
    public void searchEmployee() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(
                "(//input[@placeholder=\"Type for hints...\"])[1]"))
                .sendKeys("John");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

//        String searchedEmployeeName = driver.findElement(By.xpath(
//                "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[@role='rowgroup']/div[2]/div[1]/div[1]/div[1]"
//        )).getText();
//
//        System.out.println(searchedEmployeeName);
////        Assert.assertEquals( "John James", searchedEmployeeName);

        System.out.println("Successfully Searched the Employee");

    }


    @Test(dependsOnMethods = "searchEmployee")
//    @Test(dependsOnMethods = "addEmployee", enabled = false)      // To Disable
    public void logoutOrangeHrm() throws InterruptedException {
        driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    }


    @AfterTest
//    @AfterTest(enabled = false)       // To Disable
    public void setDown() throws InterruptedException {
        System.out.println("@AfterTest -> setDown function Executed\n");

        Thread.sleep(2000);
        driver.quit();

    }
}

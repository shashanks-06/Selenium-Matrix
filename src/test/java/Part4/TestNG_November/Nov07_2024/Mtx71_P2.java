package Part4.TestNG_November.Nov07_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mtx71_P2 {

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
    public void clickPIM() throws InterruptedException {

//        Click on "PIM"
        driver.findElement(By.xpath("//span[normalize-space()=\"PIM\"]")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickPIM")
    public void searchEmployee() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(
                "(//input[@placeholder=\"Type for hints...\"])[1]"))
                .sendKeys("Amelia");

        driver.findElement(By.xpath(
                        "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"))
                .sendKeys("01715");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

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

package Part4.TestNG.Oct28_2024_TestNgListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Mtx65_Listeners.class)
public class Mtx65_Login {

    @Test
    public void test_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passwordField.sendKeys("admin123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.quit();

        System.out.println("Successfully Login to OrangeHRM");
    }

    @Test
    public void test_Fail() {
        System.out.println("test_Fail() -> Fail Test Case");
        Assert.assertTrue(false);
        System.out.println();
    }

    @Test
    public void test_Skip() {
        System.out.println("test_Skip() -> Skip Test Case");
        System.out.println();
        throw new SkipException("Skip Exception Thrown");
    }

}

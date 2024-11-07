package Part4.TestNG_November.Nov06_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Mtx70 {
    WebDriver driver;
    String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("@BeforeTest -> Running setUp function\n");
    }

    @Test
    public void testLogin(){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedTitle = "OrangeHRM";

//        if (expectedTitle.equals("OrangeHRM")){
//            System.out.println("Login Successfully");
//        }else {
//            System.out.println("Login Failed");
//        }

        Assert.assertEquals(driver.getTitle(), expectedTitle , "Login Successfully");

        System.out.println("Page Title -> " + driver.getTitle() + "\n");

    }

    @Test(dependsOnMethods = "testLogin")
    public void testLogout() throws InterruptedException {
        driver.findElement(By.xpath("//p[contains(@class,\"oxd-userdropdown-name\")]")).click();

        List<WebElement> dropdownElements = driver.findElements(By.xpath("//a[@class=\"oxd-userdropdown-link\"]"));

        Thread.sleep(1000);

        for (int i = 0; i < dropdownElements.size() ; i++) {
            System.out.println(i +" : " + dropdownElements.get(i).getText());
        }

        dropdownElements.get(3).click();

    }

    @AfterTest
    public void setDown() throws InterruptedException {
        System.out.println("@AfterTest -> Running setDown function\n");

        Thread.sleep(2000);
        driver.quit();

    }
}

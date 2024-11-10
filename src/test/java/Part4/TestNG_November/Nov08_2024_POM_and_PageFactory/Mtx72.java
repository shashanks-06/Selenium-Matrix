package Part4.TestNG_November.Nov08_2024_POM_and_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Mtx72 {
    WebDriver driver;
    String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    Mtx72_LoginPage loginPage;
    Mtx72_DashboardPage dashboardPage;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("@BeforeTest -> setUp function Executed\n");
    }


    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        loginPage = new Mtx72_LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");    //  Valid credentials

        loginPage.clickLoginBtn();

        Thread.sleep(2000);

        dashboardPage = new Mtx72_DashboardPage(driver);
        String actualPageTitle = dashboardPage.getPageTitle();
        String expectedPageTitle = "OrangeHRM";

        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        System.out.println("Page Title Is " + actualPageTitle);

    }

    @Test
    public void loginWithInvalidCredentials() throws InterruptedException {
        loginPage = new Mtx72_LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin1");    //  Invalid credentials
        loginPage.clickLoginBtn();

        String expectedInvalidMsg = "Invalid credentials";
        String actualInvalidMsg = loginPage.getInvalidCredMessageElement();

        Assert.assertEquals(actualInvalidMsg, expectedInvalidMsg);
        System.out.println("Message -> " + actualInvalidMsg);
    }


    @AfterTest
    public void setDown() throws InterruptedException {
        System.out.println("@AfterTest -> setDown function Executed\n");

        Thread.sleep(2000);
        driver.quit();

    }

}

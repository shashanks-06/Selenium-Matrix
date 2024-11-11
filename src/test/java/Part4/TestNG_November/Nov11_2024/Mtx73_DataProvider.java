package Part4.TestNG_November.Nov11_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Mtx73_DataProvider {

    WebDriver driver;
    String URL = "https://www.google.com/";


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("@BeforeTest -> setUp function Executed\n");
    }


    @Test(dataProvider = "searchDataProvider")
    public void searchKeyword(String keyword){
        WebElement searchBox = driver.findElement(By.cssSelector("[class=\"gLFyf\"]"));
        searchBox.sendKeys(keyword , Keys.ENTER);
    }

    @DataProvider(name = "searchDataProvider")
    public Object[][] searchDataProviderMethod(){
        Object[][] searchData = new Object[2][1];
        searchData[0][0] = "Maharashtra";
        searchData[1][0] = "Madhya Pradesh";

        return searchData;
    }


    @AfterMethod
    public void setDown() throws InterruptedException {
        System.out.println("@AfterTest -> setDown function Executed\n");

        Thread.sleep(2000);
        driver.quit();

    }
}

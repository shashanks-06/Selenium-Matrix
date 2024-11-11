package Part4.TestNG_November.Nov11_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Mtx74_CrossBrowserTesting {

    WebDriver driver;


    @Test
    @Parameters("browserName")
    public void launchBrowser(String browserName){
        //        if (browserName.equals("chrome")){
//            driver = new ChromeDriver();
//        }else if (browserName.equals("edge")){
//            driver = new EdgeDriver();
//        }
        switch (browserName.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                System.out.println("For Chrome Driver");
                break;

            case "edge":
                driver = new EdgeDriver();
                System.out.println("For Edge Driver");
                break;

            default:
                driver = null;
                break;
        }
    }

    @Test(dependsOnMethods = "launchBrowser")
    public void openURL() throws InterruptedException {

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String expectedTitle = "Google";
        System.out.println("Expected Title is " + expectedTitle);

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

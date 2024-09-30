package Part2.Sel4.Sept30_2024;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Mtx32_explicitlyWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


//        Explicitly wait
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement username =  webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='user-name']")));

       username.sendKeys("Shashank");



//      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located
//      by By.xpath: //input[@id='name']

        Stopwatch stopwatch = null;

        try {
            stopwatch = Stopwatch.createStarted();
            WebElement password = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@id='passwo']")));
            password.sendKeys("1234567890");
        }catch (Exception e){
            stopwatch.stop();
            System.out.println(e);
            System.out.println(stopwatch.elapsed(TimeUnit.SECONDS) + " seconds");
        }


    }
}

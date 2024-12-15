package Part2.Sel4.Sept30_2024;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Mtx33_fluentWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

//        Fluent Wait
        Wait<WebDriver> wait = new FluentWait <WebDriver> (driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("Waiting for Chrome to finish...")
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='user-name']")))
                .sendKeys("Shashank");

//  Exception in thread "main" org.openqa.selenium.TimeoutException:
//  Expected condition failed: waiting for visibility of element located by By.xpath: //input[@id='user-']


        Stopwatch stopwatch = null;

        try {
            stopwatch = Stopwatch.createStarted();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@id='passwo']")))
                    .sendKeys("1234567890");
        }catch (Exception e){
            stopwatch.stop();
            System.out.println(e);
            System.out.println(stopwatch.elapsed(TimeUnit.SECONDS) + " seconds");
        }


    }
}

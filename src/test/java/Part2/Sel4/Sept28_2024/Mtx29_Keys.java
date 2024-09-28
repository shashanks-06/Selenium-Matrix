package Part2.Sel4.Sept28_2024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mtx29_Keys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        Thread.sleep(1000);


//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("window().scrollBy(0,400)");

        WebElement webElement = driver.findElement(By.xpath("//select[@id='month']"));

        Actions act = new Actions(driver);
        Thread.sleep(1000);
        act.click(webElement).perform();
        Thread.sleep(1000);

        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
    }
}

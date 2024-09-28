package Part2.Sel4.Sept28_2024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mtx30_Keys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://dev.automationtesting.in/form");
        driver.get("https://dev.automationtform");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,800)");

        WebElement webElement = driver.findElement(By.xpath("//select[@id='month-select']"));

        Actions act = new Actions(driver);
        act.click(webElement).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
    }
}

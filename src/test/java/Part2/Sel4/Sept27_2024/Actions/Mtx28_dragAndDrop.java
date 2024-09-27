package Part2.Sel4.Sept27_2024.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mtx28_dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement imgDrag1 = driver.findElement(By.xpath("//img[@id='mongo']"));
        WebElement imgDrag2 = driver.findElement(By.xpath("//img[@id='angular']"));
        WebElement imgDrag3 = driver.findElement(By.xpath("//img[@id='node']"));

        WebElement imgDrop = driver.findElement(By.xpath("//div[@id='droparea']"));

        Actions act = new Actions(driver);

        act.dragAndDrop(imgDrag1, imgDrop).perform();
        act.dragAndDrop(imgDrag2, imgDrop).perform();

//        Used bcoz the 3rd image was blocked by the ad, so to scroll down
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 150)");

        act.dragAndDrop(imgDrag3, imgDrop).perform();

    }
}

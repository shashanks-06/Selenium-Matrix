package Part2.Sel4.Sept27_2024.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mtx27_clickMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement gmailElement = driver.findElement(By.xpath("//a[@aria-label=\"Gmail \"]"));

        Actions act = new Actions(driver);

        act.moveToElement(gmailElement).contextClick().click().build().perform();
//      build() method is used to attach the other actions
//        we can run the actions without build() also.


//        act.moveToElement(gmailElement).perform();
//        Thread.sleep(1000);
//        act.contextClick().perform();       // We can pass the driver element or not, for both it will run
//        Thread.sleep(1000);
////        act.click().perform();
//        act.doubleClick().perform();
    }
}

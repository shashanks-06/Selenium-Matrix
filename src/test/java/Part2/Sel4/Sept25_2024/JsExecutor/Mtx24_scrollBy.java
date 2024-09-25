package Part2.Sel4.Sept25_2024.JsExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx24_scrollBy {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        JavascriptExecutor jsExecutor =  (JavascriptExecutor)driver;
        jsExecutor.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        jsExecutor.executeScript("window.scrollBy(0,-3000)");

    }
}

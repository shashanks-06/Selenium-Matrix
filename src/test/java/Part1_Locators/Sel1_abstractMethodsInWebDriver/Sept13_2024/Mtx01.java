package Part1_Locators.Sel1_abstractMethodsInWebDriver.Sept13_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx01 {
    public static void main(String[] args) throws InterruptedException {
//        To get the URL
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://www.flipkart.com");

//        To Navigate to the URL
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.myntra.com");
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.flipkart.com");
//        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.in");

        driver.navigate().back();
        driver.navigate().forward();
    }

}

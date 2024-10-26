package Part4.TestNG.Oct26_ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mtx64_Chrome {
    WebDriver driver;

    @Test
    public void test_Chrome() throws InterruptedException {
        System.out.println("Testing Chrome");
        System.out.println("Thread ID -> " + Thread.currentThread().getId());

        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String chromeTitle = driver.getTitle();
        System.out.println("WebPage Title of Chrome: " + chromeTitle);

        System.out.println();
        driver.quit();
    }
}

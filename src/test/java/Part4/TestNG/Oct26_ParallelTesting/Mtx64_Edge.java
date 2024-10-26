package Part4.TestNG.Oct26_ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mtx64_Edge {
    WebDriver driver;

    @Test
    public void test_Edge() throws InterruptedException {
        System.out.println("Testing Edge");
        System.out.println("Thread ID -> " + Thread.currentThread().getId());

        driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String edgeTitle = driver.getTitle();
        System.out.println("WebPage Title of Edge: " + edgeTitle);

        System.out.println();
        driver.quit();
    }
}

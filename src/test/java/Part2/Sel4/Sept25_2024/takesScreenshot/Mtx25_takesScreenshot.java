package Part2.Sel4.Sept25_2024.takesScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Mtx25_takesScreenshot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myntra.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        For full website screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\shash\\OneDrive\\Desktop\\Testing\\AUTOMATION_TESTING\\Selenium\\Matrix\\ScreenShots\\myntra.jpg");
        source.renameTo(destination);

    }
}

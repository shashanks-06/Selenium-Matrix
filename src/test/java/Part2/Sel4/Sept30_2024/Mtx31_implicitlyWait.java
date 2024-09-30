package Part2.Sel4.Sept30_2024;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Mtx31_implicitlyWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Shashank");


//        NoSuchElementException: no such element: Unable to locate element
//        driver.findElement(By.xpath("//wrong xPath")).sendKeys("Shashank");

        Stopwatch stopwatch = null;

        try {
            stopwatch = Stopwatch.createStarted();
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shashank");
        }catch (Exception e){
            stopwatch.stop();
            System.out.println(e);
            System.out.println(stopwatch.elapsed(TimeUnit.SECONDS) + " seconds");
        }


    }
}

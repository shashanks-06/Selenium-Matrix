package Part2.Sel4.Sept25_2024.takesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

//          getScreenshotAs - Specific WebElement

public class Mtx26_specificElemSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //        Particular Element Screenshots
//       WebElement element =  driver.findElement(By
//               .xpath("//img[@title='Thinking in HTML']"));
//        File source = element.getScreenshotAs(OutputType.FILE);
//        File destination = new File("C:\\Users\\shash\\OneDrive\\Desktop\\Testing\\AUTOMATION_TESTING\\Selenium\\Matrix\\ScreenShots\\demoBanner.png");
//        source.renameTo(destination);

        WebElement element = driver.findElement(By.xpath("//img[@alt='Site Logo']"));
        Thread.sleep(1000);
        File src = element.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\shash\\OneDrive\\Desktop\\Testing\\AUTOMATION_TESTING\\Selenium\\Matrix\\ScreenShots\\demoLogo.png");
        src.renameTo(dest);
    }
}

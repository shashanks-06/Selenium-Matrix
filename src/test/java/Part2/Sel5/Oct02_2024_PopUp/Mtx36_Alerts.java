package Part2.Sel5.Oct02_2024_PopUp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Mtx36_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Simple Alert Box
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(1000);

        JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

//        For Confirm Box
        driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
        Thread.sleep(1000);
        System.out.println(alert.getText());
//        alert.accept();
        alert.dismiss();

        Thread.sleep(1000);

//        For Prompt Box
        driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
        Thread.sleep(1000);
        alert.sendKeys("Shashank");
        Thread.sleep(1000);
        alert.accept();



    }
}

package Part2.Sel5.Oct02_2024_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Mtx35_HiddenPopUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blog.hubspot.com/website/website-pop-up-examples");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Hidden Division Pop-Up
        driver.findElement(By.xpath("//button[@id='hs-eu-decline-button']")).click();
    }
}

package Part2.Sel5.Oct03_2024;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Alert Using ExplicitlyWait

public class Mtx37_alertUsingExplicitlyWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));    // ExplicitlyWait

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();

//        Explicitly wait
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();

        Alert alert = webDriverWait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
    }
}


package Sept18_2024.xPath.byText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.flipkart.com/");
//        driver.manage().window().maximize();
//
////        xPath by using text
//        driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(1000); // Website is taking more time to load, so doesn't match the Selenium Speed
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();


    }
}

package Part1_Locators.Sel2_Locators.Sept19_2024_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // dropdown menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).click();

        // logout
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]")).click();






    }
}

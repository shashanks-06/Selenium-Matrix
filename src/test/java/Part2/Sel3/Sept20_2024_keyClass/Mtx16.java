package Part2.Sel3.Sept20_2024_keyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mtx16 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id=\"user-name\"]"))
                .sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.ENTER);

        
    }
}

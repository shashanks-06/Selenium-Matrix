package Part1_Locators.Sel2_Locators.Sept16_2024_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// USING CSS SELECTORS - COMBINATION OF TAG & ID
public class Mtx07 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();

//        USERNAME
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

//        PASSWORD
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

//        LOGIN BUTTON
        // We can also write like this without tag name only using the id with "#"
        driver.findElement(By.cssSelector("#login-button")).click();
    }
}

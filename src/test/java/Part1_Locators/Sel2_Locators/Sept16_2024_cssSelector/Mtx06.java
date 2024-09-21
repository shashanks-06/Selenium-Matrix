package Part1_Locators.Sel2_Locators.Sept16_2024_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// USING CSS SELECTORS - COMBINATION OF TAG NAME
public class Mtx06 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();

//        USERNAME
        driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");

//        PASSWORD
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");

//        LOGIN BUTTON
        driver.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();

//        MENU BUTTON
        driver.findElement(By.cssSelector("div[style=\"z-index: 1000;\"]")).click();
        Thread.sleep(2000);

//        LOGOUT BUTTON
driver.findElement(By.cssSelector("a[href=\"./index.html\"]")).click();
        Thread.sleep(1000);

        driver.close();
    }
}

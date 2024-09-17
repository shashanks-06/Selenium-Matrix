package Sept16_2024_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// HTML LOCATORS

public class Mtx05 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");

        driver.manage().window().maximize();

//        USERNAME
//        driver.findElement(By.id("user-name")).click();       // No need of click
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

//        PASSWORD
//        driver.findElement(By.id("password")).click();
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

//        LOGIN BUTTON
        driver.findElement(By.className("btn_action")).click();

//        MENU BUTTON
        driver.findElement(By.className("bm-burger-button")).click();
        Thread.sleep(2000);

//        LOGOUT BUTTON
        driver.findElement(By.id("logout_sidebar_link")).click();

        driver.close();

    }
}

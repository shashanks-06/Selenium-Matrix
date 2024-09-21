package Part1_Locators.Sel2_Locators.Sept18_2024_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx09 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Laptop");
        // Both Works ->  But [] is mandatory
//        driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("Laptop");

//        TAG , CLASS AND ATTRIBUTE
//        driver.findElement(By.cssSelector("input.Pke_EE[name=\"q\"]")).sendKeys("Gaming Laptop");
        // Both Works ->  But [] is mandatory
        driver.findElement(By.cssSelector(".Pke_EE[name=\"q\"]")).sendKeys("PS5");
    }

}

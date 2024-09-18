package Sept18_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx08 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
//        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

//        For ID    ->  "#"
//        For Amazon
//        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Shoes"); // -> Both way works
//        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Shoes");

//        For Class    ->  "."
//        driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Laptop"); // -> Both way works
        driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("Laptop");
    }
}

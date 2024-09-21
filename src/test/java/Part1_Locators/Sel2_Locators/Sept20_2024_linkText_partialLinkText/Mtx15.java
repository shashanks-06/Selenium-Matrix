package Part1_Locators.Sel2_Locators.Sept20_2024_linkText_partialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Mtx15 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

//        using linkText()
//        It contains the incomplete Text
//        driver.findElement(By.linkText("Sauce Labs Backpack")).click();

//        using partialLinkText()
//        It contains the incomplete Text and selects the first occurrence of that incomplete linkText
//        driver.findElement(By.partialLinkText("Bike Light")).click();

        //       We can find the count of certain link appearance by using partialLinkText() and List Framework
        List<WebElement> textList =  driver.findElements(By.partialLinkText("Sauce Labs"));
        System.out.println("Elements Count: " + textList.size());


    }
}

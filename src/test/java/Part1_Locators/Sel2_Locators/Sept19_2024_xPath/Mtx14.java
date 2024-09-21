package Part1_Locators.Sel2_Locators.Sept19_2024_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("IPhone");

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//        using indexing to find same attributes values
        driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();

        String product = driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).getText();
        // To get the text by using .getText();
        System.out.println(product);

//        xPath by using text
//        driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();




    }
}

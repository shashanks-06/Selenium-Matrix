package Part3.Sel6.Oct07_2024;

// Dynamic Web Element

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Mtx42_DynamicWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"))
//                .sendKeys("Gaming Laptop", Keys.ENTER);
//        String rating = driver.findElement(By.xpath("(//div[@class=\"XQDdHH\"])[1]")).getText();
//        System.out.println("Rating : " + rating);       // Rating : 4.6


        driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"))
                .sendKeys("Samsung Mobile 5G", Keys.ENTER);

        String numOfRatings = driver.findElement(By.xpath(
                "(//span[@class=\"Wphh3N\"]/span[1]/span[1])[1]")).getText();
        System.out.println("No. of Ratings : "+ numOfRatings);

        String numOfReviews = driver.findElement(By.xpath(
//                "(//span[@class=\"Wphh3N\"]/span[1]/span[3])[1]"
            "(//span[@class=\"Wphh3N\"]//span)[4]"
             )).getText();
        System.out.println("No. of Reviews : "+ numOfReviews);
    }
}

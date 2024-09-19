package Sept19_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx15 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

//        getTitle() of webpage
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);      // To get the title of the webpage
        String actualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Cases is Passing");
        }else {
            System.out.println("Test Cases is Failing");
        }
    }
}

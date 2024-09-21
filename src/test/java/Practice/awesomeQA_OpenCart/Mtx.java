package Practice.awesomeQA_OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/ui");
        driver.manage().window().maximize();

        Thread.sleep(1000);
//        Dropdown Menu
        driver.findElement(By.xpath("//span[@class=\"caret\"]")).click();

//        Register Button
        driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();

//        Register User Payload
        String firstName = "Jeralee";
        String lastName = "MacKenzie";
        String email = "icockshtt3@businessinsider.com";
        String telephone = "883-282-8076";
        String password = "dZ3#gqxr~CUs";

//        Filling Data and Registering
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys(telephone);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
        Thread.sleep(1000);

//        Navigating to the main page
        driver.navigate().to("https://awesomeqa.com/ui");
//        driver.findElement(By.xpath("//img[@class=\"img-responsive\"]")).click();
        Thread.sleep(1000);


//        driver.close();
    }
}

package Sept19_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://only-testing-blog.blogspot.com");
        driver.manage().window().maximize();

//        xPath-> using starts-with()
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@name, 'gparent1')]")).click();
    }
}

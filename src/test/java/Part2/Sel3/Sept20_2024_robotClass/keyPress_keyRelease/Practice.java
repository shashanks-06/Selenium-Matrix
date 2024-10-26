package Part2.Sel3.Sept20_2024_robotClass.keyPress_keyRelease;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {
    public static void main(String[] args) throws  InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();

        WebElement optionDropdown = driver.findElement(By.cssSelector("select#dropdown"));
        optionDropdown.click();

        Thread.sleep(2000);

        driver.quit();
    }
}

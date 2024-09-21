package Part2.Sel3.Sept21_2024_dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Mtx20_getOptions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();

        WebElement optionDropdown = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select selectOption = new Select(optionDropdown);

        List<WebElement> dropDownElements = selectOption.getOptions();
        System.out.println("No. of Elements are " + dropDownElements.size());

        for(WebElement webElement : dropDownElements){
            System.out.println(webElement.getText());  // For Text Format
        }
    }
}

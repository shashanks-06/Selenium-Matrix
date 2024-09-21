package Part2.Sel3.Sept21_2024_dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtx19_isMultiple {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();

        WebElement optionDropdown = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select selectOption = new Select(optionDropdown);

        selectOption.selectByVisibleText("Option 1");
        Thread.sleep(1000);

        selectOption.selectByValue("2");
        Thread.sleep(1000);

        selectOption.selectByIndex(1);

//        isMultiple() checks for the multiple checkboxes present or not and returns Boolean
        if (selectOption.isMultiple()){
            System.out.println("Dropdown's Multiple Selection is available");
        }else {
            System.out.println("Dropdown's Multiple Selection is not available");
        }
    }
}

package Part2.Sel3.Sept21_2024_dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtx18_Select {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
//        Thread.sleep(1000);

//        Wait Concept
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // -> website will wait for 10 secs

        WebElement countryDropDown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select selectCountry = new Select(countryDropDown);

//      1. selectByVisibleText()
        selectCountry.selectByVisibleText("India");
        Thread.sleep(1000);

//        2. selectByValue()    value="IN"
        selectCountry.selectByValue("IS");
        Thread.sleep(1000);

//        selectByIndex -> By indexing in int -> start from 0
        selectCountry.selectByIndex(6);
        Thread.sleep(1000);

        WebElement optionDropdown = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select selectOption = new Select(optionDropdown);

        selectOption.selectByVisibleText("Option 1");
        Thread.sleep(1000);

        selectOption.selectByValue("2");
        Thread.sleep(1000);

        selectOption.selectByIndex(1);


    }
}

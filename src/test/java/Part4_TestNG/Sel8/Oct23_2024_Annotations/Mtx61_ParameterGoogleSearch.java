package Part4_TestNG.Sel8.Oct23_2024_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Objects;

public class Mtx61_ParameterGoogleSearch {

    @Parameters({"searchKeyword"})
    @Test
    public void googleSearch(String searchData) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement searchBoxField = driver.findElement(By.cssSelector("#APjFqb"));
//        searchBoxField.sendKeys(searchData, searchBoxField.getAttribute("value"));
        searchBoxField.sendKeys(searchData, Objects.requireNonNull(searchBoxField.getAttribute("value")));


        Thread.sleep(2000);
        driver.quit();
    }
}

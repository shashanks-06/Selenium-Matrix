package Part4.TestNG.Oct25_2024_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mtx62_DataConsumer {

    @Test(dataProviderClass = Mtx62_DataProvider.class, dataProvider = "searchDataSet")
    public void TC_googleSearch(String country, String capitalCity) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
        searchField.sendKeys(country + " " + capitalCity, Keys.ENTER);

        Thread.sleep(2000);

        driver.quit();
//        driver.close();
    }
}

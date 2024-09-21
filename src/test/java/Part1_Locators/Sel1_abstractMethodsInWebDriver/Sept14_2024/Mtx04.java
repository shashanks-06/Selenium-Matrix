package Part1_Locators.Sel1_abstractMethodsInWebDriver.Sept14_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx04 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String actual = driver.getTitle();
        System.out.println(actual);

        String expected = "OrangeHRM";

        if (actual.equals(expected)){
            System.out.println("Title Matched");
        }else {
            System.out.println("Title Not Matched");
        }
        driver.close();
    }
}

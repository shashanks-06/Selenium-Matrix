package Part2.Sel3.Sept23_2024;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Mtx21_dropdownSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        Thread.sleep(1000);     // will wait for 1 sec after then it will do following operations

//        driver will wait for 2 sec but here it will show error if the operation before this line not run within 2 sec
//        otherwise it will run the following operation
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//        driver.findElement(By
//                .xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]"))
//                .click();
//      We can do any one of the way to select from this two
        driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();

        driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();


    }
}

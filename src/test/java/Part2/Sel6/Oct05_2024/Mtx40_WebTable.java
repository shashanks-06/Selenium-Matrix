package Part2.Sel6.Oct05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Mtx40_WebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/shash/OneDrive/Desktop/Testing/AUTOMATION_TESTING/Selenium/Matrix/Table/Table.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String secondCell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(secondCell);

        List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("No.of Rows: "+ rowList.size());

        List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("No.of Columns: "+columnList.size());

//        To print the cell items of the table
        for (int i = 2; i <= rowList.size(); i++) {
            for (int j = 1; j <= columnList.size(); j++) {
               String cell = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.println(cell);
            }
        }
    }
}

package Part3.Sel6.Oct07_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Mtx41_WebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Find the no.of Rows
        List<WebElement> rowLists = driver.findElements(By.xpath(
                "//table[@name=\"BookTable\"]//tbody//tr"));
        System.out.println("No. of Rows in table: " + rowLists.size());

        System.out.println();

//        Find the no.of columns
        List<WebElement> columnList = driver.findElements(By.xpath(
                "//table[@name=\"BookTable\"]//tbody//tr[1]//th"));
        System.out.println("No. of Columns: " + columnList.size());

        System.out.println();

//        Print Columns name
        for (WebElement columns : columnList){
            System.out.print(columns.getText() + " | ");
        }

        System.out.println();

//        Find the Cell Items of the table
        for (int i = 2; i <= rowLists.size(); i++) {
            for (int j = 1; j <= columnList.size(); j++) {
                String cell = driver.findElement(By.xpath(
                        "//table[@name=\"BookTable\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(cell + " | ");
            }
            System.out.println();
        }


    }
}

package Part2.DataDrivenTesting.Oct14_2024_CountUserPassAndPrint;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Mtx48_MultipleTime {
    public static void main(String[] args) throws IOException, InterruptedException {

        String FILE_PATH = "C:\\Users\\shash\\OneDrive\\Desktop\\Testing\\AUTOMATION_TESTING\\Selenium\\Matrix\\ExcelReading\\UserPass.xlsx";

        FileInputStream file = new FileInputStream(FILE_PATH);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");


        int totalRows = sheet.getLastRowNum();
        System.out.println("Total Rows : " + totalRows);

        int totalColumns = sheet.getRow(0).getLastCellNum();
        System.out.println("Total Columns : " + totalColumns);

        for (int r = 1; r <= totalRows ; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            System.out.print(r + " -> ");

            XSSFCell username = currentRow.getCell(0);
            System.out.print(username.toString() + "   ");

            XSSFCell password = currentRow.getCell(1);
            System.out.print(password.toString() + " ");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//input[@id='user-name']"))
                            .sendKeys(username.toString());
            driver.findElement(By.xpath("//input[@id='password']"))
                            .sendKeys(password.toString());

            Thread.sleep(500);

            driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

            Thread.sleep(500);

            driver.close();
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}

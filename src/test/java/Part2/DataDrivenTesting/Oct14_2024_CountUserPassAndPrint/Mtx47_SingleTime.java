package Part2.DataDrivenTesting.Oct14_2024_CountUserPassAndPrint;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Mtx47_SingleTime {
    public static void main(String[] args) throws IOException, InterruptedException {

        String FILE_PATH = "C:\\Users\\shash\\OneDrive\\Desktop\\Testing\\AUTOMATION_TESTING\\Selenium\\Matrix\\ExcelReading\\UserPass.xlsx";

//        Create an object of FileInputStream to read data
        FileInputStream file = new FileInputStream(FILE_PATH);

//        Extract the workbook from the file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

//        From the workbook we get the sheet and stored it in the variable
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        Enter the username
        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys(sheet.getRow(1).getCell(0).toString());

//        Enter the password
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys(sheet.getRow(1).getCell(1).toString());

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        Thread.sleep(1000);

        driver.close();
        workbook.close();
        file.close();
    }
}

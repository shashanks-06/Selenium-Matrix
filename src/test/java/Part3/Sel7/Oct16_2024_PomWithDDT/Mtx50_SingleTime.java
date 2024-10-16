package Part3.Sel7.Oct16_2024_PomWithDDT;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Mtx50_SingleTime {
    public static void main(String[] args) throws IOException, InterruptedException {
        String FILE_PATH = "src/test/java/Part3/Sel7/TestData/UserPass.xlsx";

        FileInputStream file = new FileInputStream(FILE_PATH);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

//        String username = sheet.getRow(1).getCell(0).toString();
        String username = sheet.getRow(1).getCell(0).getStringCellValue();

//        String password = sheet.getRow(1).getCell(1).toString();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();

//        System.out.println(username + " " + password);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);

        LoginPageDDT loginPageDDT = new LoginPageDDT(driver);
        loginPageDDT.enterUsername(username);
        loginPageDDT.enterPassword(password);
        loginPageDDT.clickLoginButton();

        HomePageDDT homePageDDT = new HomePageDDT(driver);
        homePageDDT.clickCartButton();
    }
}

package Part3.Sel7.Oct16_2024_PomWithDDT;

import Part3.Sel7.Oct15_2024_PomClass.Homepage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Mtx51_MultipleTime {
    public static void main(String[] args) throws IOException, InterruptedException {
        String FILE_PATH = "src/test/java/Part3/Sel7/TestData/UserPass.xlsx";

        FileInputStream file = new FileInputStream(FILE_PATH);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        for (int i = 1; i <= sheet.getLastRowNum() ; i++) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String username = sheet.getRow(i).getCell(0).getStringCellValue();
            String password = sheet.getRow(i).getCell(1).getStringCellValue();

            LoginPageDDT loginPageDDT = new LoginPageDDT(driver);
            loginPageDDT.enterUsername(username);
            loginPageDDT.enterPassword(password);
            loginPageDDT.clickLoginButton();

            Thread.sleep(1000);

            if (!loginPageDDT.isLoginSuccessFull()){
                System.out.println("Login failed for " + username + " -> " + password);
                driver.quit();  // Close browser before moving to the next iteration
                continue;  // Move to the next iteration
            }

            Thread.sleep(1000);
            HomePageDDT homePageDDT = new HomePageDDT(driver);
            homePageDDT.clickCartButton();

            Thread.sleep(1000);

            driver.close();

        }

        workbook.close();
        file.close();
    }
}

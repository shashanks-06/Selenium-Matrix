package Part2.DataDrivenTesting.Oct11_2024_ExcelWriting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mtx46_RandomData {
    public static void main(String[] args) throws IOException {
        FileOutputStream file;
        XSSFWorkbook workbook;
        XSSFSheet sheet;

        String PATH = "src/test/java/Part3/Parameterization/TestData/RandomExcelData.xlsx";

        try {
            file = new FileOutputStream(PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        workbook = new XSSFWorkbook();

        sheet = workbook.createSheet("Single Random Data");

        XSSFRow row = sheet.createRow(3);
        XSSFCell cell = row.createCell(2);
        cell.setCellValue("Shashank");

        workbook.write(file);

        workbook.close();
        file.close();

        System.out.println("File is Created.........");

    }
}

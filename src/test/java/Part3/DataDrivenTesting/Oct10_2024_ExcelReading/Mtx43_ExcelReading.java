package Part3.DataDrivenTesting.Oct10_2024_ExcelReading;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mtx43_ExcelReading {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = null;
        XSSFWorkbook workbook;
        XSSFSheet sheet;


        String FILE_PATH = "src/test/java/Part3/Parameterization/TestData/MyReadFile.xlsx";

        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath);

//        Open the file in Reading Mode
        try {
             file = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        Extract the Workbook from File
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//      From thw Workbook, we get the sheet and store it into the variable
        try {
            sheet = workbook.getSheet("Sheet1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        It will write the last row number
        int totalRows = sheet.getLastRowNum();
        System.out.println("Total Rows : " + totalRows);    // 4

//        It will write the 0th row's last cell number ->> Total Columns
        int totalColumns = sheet.getRow(0).getLastCellNum();
        System.out.println("Total Columns : " + totalColumns);      //  3


        for (int r = 0; r <= totalRows ; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            System.out.print(r + " -> ");

            for (int c = 0; c < totalColumns; c++) {
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString() + "   ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}

package Part2.DataDrivenTesting.Oct10_2024_ExcelReading;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException {

        String PATH = "src/test/java/Part2/DataDrivenTesting/TestData/MyReadFile.xlsx";

        FileInputStream file = new FileInputStream(PATH);

//        xlsx -> XSSF
//        xls -> HSSF

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum();
        System.out.println( "Total rows -> " +totalRows);   // 4

        int totalColumns = sheet.getRow(0).getLastCellNum(); // 0th row -> last cell no.
        System.out.println( "Total columns -> " +totalColumns);      // 3


//        0     ->    4
        for (int r = 0; r <= totalRows ; r++) {
            XSSFRow currentRow = sheet.getRow(r);
//            0  ->  3
            for (int c = 0; c < totalColumns ; c++) {
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell + "   ");
            }
            System.out.println();
        }

        workbook.close();
        file.close();

    }
}

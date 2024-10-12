package Part3.Parameterization.Oct11_2024_ExcelWriting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Mtx45_Dynamic {
    public static void main(String[] args) throws IOException {
        FileOutputStream file;
        XSSFWorkbook workbook;
        XSSFSheet sheet;


        String PATH = "src/test/java/Part3/Parameterization/TestData/DynamicExcelData.xlsx";

        try {
            file = new FileOutputStream(PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        workbook = new XSSFWorkbook();

        sheet = workbook.createSheet("Dynamic Data");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int numOfRows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int numOfCells = sc.nextInt();

        for (int r = 0; r < numOfRows; r++) {
            XSSFRow currentRow = sheet.createRow(r);

            for (int c = 0; c < numOfCells ; c++) {
                XSSFCell cell = currentRow.createCell(c);
                cell.setCellValue(sc.next());                   //  next for all types of data types
            }
        }

        workbook.write(file);

        workbook.close();
        file.close();

        System.out.println("File is Created.........");
    }
}

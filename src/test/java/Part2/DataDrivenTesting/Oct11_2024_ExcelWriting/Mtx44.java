package Part2.DataDrivenTesting.Oct11_2024_ExcelWriting;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mtx44 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file;
        XSSFWorkbook workbook;
        XSSFSheet sheet;

        String FILE_PATH = "src/test/java/Part3/Parameterization/TestData/MyWrittenFile.xlsx";

//            Open the file in writing mode and give name to file
        try {
            file = new FileOutputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        Create a Workbook class object to create a new Workbook
            workbook = new XSSFWorkbook();

//        Inside the workbook we created a sheet and save it into the variable
        sheet = workbook.createSheet("Data");

//      Create the 1st row into the sheet
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Shashank");    // create a cell into the row
        row1.createCell(1).setCellValue("Sanjay");
        row1.createCell(2).setCellValue("Surjekar");
        row1.createCell(3).setCellValue(60101);


//      Create the 2nd row into the sheet
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Shantanu");
        row2.createCell(1).setCellValue("Sanjay");
        row2.createCell(2).setCellValue("Surjekar");
        row2.createCell(3).setCellValue(70696);

        //      Create the 3rd row into the sheet
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("John");
        row3.createCell(1).setCellValue("James");
        row3.createCell(2).setCellValue("Doe");
        row3.createCell(3).setCellValue(11111);

//      To write the data sheet of workbook into the file
        workbook.write(file);   // attached the workbook to the file

        workbook.close();
        file.close();

        System.out.println("File is Created");

    }
}

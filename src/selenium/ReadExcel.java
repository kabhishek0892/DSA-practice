package selenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) throws IOException {
        String path="src/Testdata.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet= book.getSheetAt(0);
        int lastRow = sheet.getLastRowNum();
        System.out.println("Last row no is "+ lastRow);

        for(int i=1;i<=lastRow;i++)
        {
            Row row = sheet.getRow(i);
            int lastCellNo =row.getLastCellNum();
            for(int j=0;j<lastCellNo;j++)
            {
                Cell cell =  row.getCell(j);
                String value = cell.getStringCellValue();
                System.out.println(value);
            }
        }
       int vRow = 1;
        int vColumn=0;//Read Partiuclar Cell
        Sheet sheet1=book.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        String value=cell.getStringCellValue();//getting cell value
        System.out.println("username is "+ value);
    }
}

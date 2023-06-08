package DataProvider.util;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3.x2000.x09.xmldsig.ObjectType;

import java.io.FileInputStream;
import java.io.IOException;

public class ForDataProvider {

    public static Object[][] getMyData(String filePath,String sheetName) throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream(filePath);
        // 2. convert the file object into the workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // 3. identify the working sheet
        XSSFSheet sheet = workbook.getSheet(sheetName);
        //4. get the count of active rows  &  columns
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        // 5. create the 2 D object array to store columns x rows values
        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1;i++)
        {
            XSSFRow row = sheet.getRow(i+1);

            for(int j=0;j<colCount;j++) {
                XSSFCell cell = row.getCell(j);
                if (cell == null)
                    data[i][j] = "";
                else {
                    cell.setCellType(CellType.STRING);

                    data[i][j] = cell.toString();
                }
            }
        }
        return data;
    }
}

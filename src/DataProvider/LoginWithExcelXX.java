package DataProvider;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginWithExcelXX {

    @Test(dataProvider = "getData")
    public void loginTest(String username,String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys(password);

        Thread.sleep(2000);
        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("Data/MyData.xlsx");
        // 2. convert the file object into the workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // 3. identify the working sheet
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //4. get the count of active rows  &  colums
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        // 5. create the 2 D object array to store columns x rows values
        Object[][] data = new Object[rowCount-1][colCount]; // row = 5 --> last row index-> 4

        for (int i=0;i<rowCount-1;i++)
        {
            XSSFRow row = sheet.getRow(i+1);

             XSSFCell username = row.getCell(0);
             if (username==null)
                 data[i][0] = "";
             else
                 data[i][0] = username.toString();

             XSSFCell password =  row.getCell(1);
             if (password==null)
                data[i][1] = "";
            else
              data[i][1] = password.toString();
        }
        return data;



        /*Object[][] data = new Object[4][2];

        data[0][0] = "tomsmith";
        data[0][1] = "SuperSecretPassword!";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";

        return data;*/
    }
}

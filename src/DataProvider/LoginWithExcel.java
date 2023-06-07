package DataProvider;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginWithExcel {

    @Test(dataProvider = "getData")
    public void loginTest(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("Data/MyData1.xls");
        // 2. convert the file object into the workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        // 3. identify the working sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");
        //4. get the count of active rows  &  colums
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        // 5. create the 2 D object array to store columns x rows values
        Object[][] data = new Object[rowCount][colCount];

        for (int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

             HSSFCell username = row.getCell(0);

             if (username==null)
                 data[i][0] = "";
             else
                 data[i][0] = username.toString();


             HSSFCell password =  row.getCell(1);

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

package ExtentReportDemo.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {


    public static String getMyScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot and assign
        // the driver to it, typecast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using the ts object reference
        // store this into a file object
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }
}

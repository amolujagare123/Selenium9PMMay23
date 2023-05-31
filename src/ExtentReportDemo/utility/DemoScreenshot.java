package ExtentReportDemo.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class DemoScreenshot {

    @Test
    public void screenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1. create the object reference of TakesScreenshot and assign
        // the driver to it, typecast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using the ts object reference
        // store this into a file object
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());


        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));


    }
}

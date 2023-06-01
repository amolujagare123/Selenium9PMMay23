package ExtentReportDemo.utility;

import TestNGDemo.Demo2.utilInit.InitDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportDemo.utility.Util.getMyScreenshot;
import static ExtentReportDemo.utility.Util.initExtentReport;
//import static TestNGDemo.Demo2.utilInit.InitDriver.getDriver;

public class ExtentReportListeners extends InitDriver implements ITestListener {

    ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        //System.out.println("----onTestStart----");
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
      //  System.out.println("----onTestSuccess----");
        test.pass("This test is passed");
    }

    public void onTestFailure(ITestResult result) {
        //System.out.println("----onTestFailure----");
        test.fail("This test is failed |"+result.getThrowable());
        try {
          //  test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(getDriver()));
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onStart(ITestContext context) {
        //System.out.println("----onStart----");
        if (extent==null)
          extent = initExtentReport();
    }

    public void onFinish(ITestContext context) {
       // System.out.println("----onFinish----");
        extent.flush();
    }
}

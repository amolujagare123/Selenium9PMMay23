package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportDemo.utility.Util.getMyScreenshot;
import static org.testng.TestRunner.PriorityWeight.priority;

public class LoginDemo {

    ExtentReports extent;

    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Project Name","Stock Management");
        extent.setSystemInfo("Developers Name","Nisha");
        extent.setSystemInfo("Testers Name","Narayanam");
        extent.setSystemInfo("Project deadline","31 May 2023");
        extent.setSystemInfo("Technology used","Java / MySql");

    }

    @BeforeClass
    public void openBrowser()
    {

    }

    @AfterClass
    public void writeToTest()
    {
        extent.flush();
    }

    @Test
    public void validloginTest() throws IOException {

        ExtentTest test = extent.createTest("Valid Login Test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        test.info("Browser is maximized");

        driver.get("http://localhost/stock/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("This test is pssed");
        }
        catch (AssertionError e)
        {
            test.fail(e);
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }
      /*  catch (Exception e)
        {
            test.fail(e);
        }*/
    }

    @Test
    public void invalidloginTest() {

        ExtentTest test = extent.createTest("inValid Login Test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        test.info("Browser is maximized");

        driver.get("http://localhost/stock/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dfdfdf");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("fdfdfd");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");


    }
    @Test
    public void blankLoginTest() {

        ExtentTest test = extent.createTest("blank Login Test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        test.info("Browser is maximized");

        driver.get("http://localhost/stock/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");


    }
}

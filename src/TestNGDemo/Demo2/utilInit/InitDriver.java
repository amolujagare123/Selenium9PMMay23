package TestNGDemo.Demo2.utilInit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitDriver {

    public static WebDriver driver;
    @BeforeClass // method written below this annotation will run before first test method of the class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // method written below this annotation will run after last test method of the class
    public void closeBrowser()  {
        driver.close();
    }

 /*   public static WebDriver getDriver()
    {
        return driver;
    }*/
}

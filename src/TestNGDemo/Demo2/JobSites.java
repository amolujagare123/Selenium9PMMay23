package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {



    WebDriver driver;
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

    @Test
    public void naukri()
    {
        driver.get("https://www.naukri1.com/");
    }
    @Test
    public void foundit()
    {
        driver.get("https://www.foundit.in/");
    }
    @Test (priority = 3)
    public void shine()
    {
        driver.get("https://www.shine.com/");
    }
    @Test (priority = 1)
    public void timesJobs()
    {
        driver.get("https://www.timesjobs.com/");
    }

}

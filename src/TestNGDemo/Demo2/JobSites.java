package TestNGDemo.Demo2;

import TestNGDemo.Demo2.utilInit.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitDriver {



    @Test
    public void naukri()
    {
        driver.get("https://www.naukri.com/");
        Assert.assertEquals(driver.getTitle(),"Stack Overflow","incorrect page/this is not stack overflow");

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

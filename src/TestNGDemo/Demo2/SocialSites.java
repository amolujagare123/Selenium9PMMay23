package TestNGDemo.Demo2;

import TestNGDemo.Demo2.utilInit.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends InitDriver {



    @Test
    public void facebook()
    {
        driver.get("https://facebook.com");
    }

    @Test
    public void instagram()
    {
        driver.get("https://instagram.com");
    }

    @Test
    public void linkedIn()
    {
        driver.get("https://linkedIn.com");
    }

    @Test
    public void twitter()
    {
        driver.get("https://twitter.com");
    }
}

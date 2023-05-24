package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

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

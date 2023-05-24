package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites {

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
    public void stackOverflow()
    {
        driver.get("https://stackoverflow.com");
    }
    @Test
    public void chatGTP()
    {
        driver.get("https://chat.openai.com/");
    }
    @Test
    public void w3schools()
    {
        driver.get("https://www.w3schools.com/");
    }
    @Test
    public void oracle()
    {
        driver.get("https://docs.oracle.com/javase/tutorial/");
    }
}

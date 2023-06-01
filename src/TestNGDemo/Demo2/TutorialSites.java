package TestNGDemo.Demo2;

import TestNGDemo.Demo2.utilInit.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites extends InitDriver {



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

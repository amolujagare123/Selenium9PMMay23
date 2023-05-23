package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo3 {

  static WebDriver driver;
    @BeforeClass // method written below this annotation will run before first test method of the class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // method written below this annotation will run after last test method of the class
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void loginTest1()
    {

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("tomsmith");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("SuperSecretPassword!");

        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }
    @Test
    public void loginTest2()
    {

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("sdsdsd");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("dsd!");

        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }

    @Test
    public void loginTest3()
    {

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }



}

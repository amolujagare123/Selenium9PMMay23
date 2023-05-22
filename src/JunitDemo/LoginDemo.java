package JunitDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {


    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.className("radius"));
        btnLogin.click();
    }
}

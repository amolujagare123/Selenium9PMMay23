package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

      // Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement txtUsername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
    }
}

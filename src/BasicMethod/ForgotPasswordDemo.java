package BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento2-demo.magebit.com/admin");

     //driver.findElement(By.className("action-forgotpassword")).click();

       // driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.partialLinkText("Forgot y")).click();


    }
}

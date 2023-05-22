package CSSSelectorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

      /*  driver.findElement(By.cssSelector("input#email")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button.btn-primary")).click();
*/
        driver.findElement(By.cssSelector("#email")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("admin123");
        driver.findElement(By.cssSelector(".btn-primary")).click();



    }
}

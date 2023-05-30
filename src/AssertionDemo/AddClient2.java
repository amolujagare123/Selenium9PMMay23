package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddClient2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String name = "Jayanta1";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("455454545");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("32323232");


        driver.findElement(By.xpath("//input[@name='Submit']")).click();




        String expected = "Customer Details Added";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[contains(@class,'box')]")).getText();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"wrong message");




      /*  System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"this is not a dashboard");*/

    }
}

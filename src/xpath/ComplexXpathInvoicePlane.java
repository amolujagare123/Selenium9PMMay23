package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexXpathInvoicePlane {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();

        String name = "Amar Tulase";
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//i[contains(@class,'edit')]")).click();



    }
}

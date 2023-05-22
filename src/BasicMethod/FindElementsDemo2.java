package BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      //  Thread.sleep(20000);

        List<WebElement>  wbList = driver.findElements(By.tagName("input"));
        System.out.println(wbList.size());

        wbList.get(1).sendKeys("Admin");
        wbList.get(2).sendKeys("admin123");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();




    }
}

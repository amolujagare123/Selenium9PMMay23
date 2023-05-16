package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LongLink {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       // WebElement longTextLinkWithSpace = driver.findElement(By.xpath(" //a[normalize-space()='please click here to go to the facebook page']"));
        WebElement longTextLinkWithSpace
                = driver.findElement(By.xpath("//a[contains(text(),'the facebook page')]"));
        longTextLinkWithSpace.click();


    }
}

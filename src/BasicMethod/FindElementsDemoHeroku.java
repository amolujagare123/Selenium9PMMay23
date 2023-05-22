package BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsDemoHeroku {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      //  Thread.sleep(20000);


      //  List<WebElement>  wbList = driver.findElements(By.tagName("a"));
      //  List<WebElement>  wbList = driver.findElements(By.xpath("//a[not(contains(@href,'http'))]"));
        /*List<WebElement>  wbList = driver.findElements(By.xpath("//li/a"));
        System.out.println(wbList.size());

        wbList.get(6).click();*/

        WebElement element = driver.findElement(By.xpath("//li/a"));
        element.click();


    }
}

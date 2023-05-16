package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_list_test");

        driver.switchTo().frame("iframeResult");

        String txt = driver.findElement(By.xpath("//li[text()='Coffee']")).getText();
        System.out.println("txt="+txt);

    }
}

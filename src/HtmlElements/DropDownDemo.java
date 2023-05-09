package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the element of drop down
        WebElement selText = driver.findElement(By.id("seltext"));

        // 2. create the object of select class
        Select sel = new Select(selText);

        Thread.sleep(4000);
        // 3. select from drop down
       // sel.selectByVisibleText("text 3");
      //  sel.selectByIndex(4);
        sel.selectByValue("v12");
    }
}

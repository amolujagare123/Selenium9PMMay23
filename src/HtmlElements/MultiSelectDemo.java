package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the element of multiselect list
        WebElement multiSelect = driver.findElement(By.id("multiSel"));

        // 2. create the object of select class
        Select sel = new Select(multiSelect);

        Thread.sleep(4000);

        sel.selectByVisibleText("text 1"); //0 - index

        Thread.sleep(4000);
        sel.selectByIndex(2);

        Thread.sleep(4000);
        sel.selectByIndex(3);

       /* Thread.sleep(4000);
        sel.deselectByIndex(0);

        Thread.sleep(4000);
        sel.deselectByIndex(2);

        Thread.sleep(4000);
        sel.deselectByIndex(3);
        */
        Thread.sleep(4000);
        sel.deselectAll();

    }
}

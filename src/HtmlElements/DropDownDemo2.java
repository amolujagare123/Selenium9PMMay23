package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        // 1. find the element of drop down
        WebElement community = driver.findElement(By.id("sel4"));

        // 2. create the object of select class pass the web element to its constructor
        Select selCommunity = new Select(community);

        Thread.sleep(4000);
        // 3. select from drop down
        //selCommunity.selectByVisibleText("No religion");
       // selCommunity.selectByValue("Inter religion");
        selCommunity.selectByIndex(10);


    }
}

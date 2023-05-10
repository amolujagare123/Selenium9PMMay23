package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectJobPortalDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the element of multiselect list
        WebElement city = driver.findElement(By.id("source_118"));

        // 2. create the object of select class
        Select selCity = new Select(city);

        Thread.sleep(4000);
        selCity.selectByVisibleText("Bangalore");
        selCity.selectByVisibleText("Chennai");
        selCity.selectByVisibleText("Mumbai");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement addedCity = driver.findElement(By.id("fld_118"));
        Select selAddedCity = new Select(addedCity);
        selAddedCity.selectByIndex(0);
        selAddedCity.selectByIndex(1);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();


    }
}

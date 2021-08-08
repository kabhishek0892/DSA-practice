package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Interview {

    //Open google.com -- > search for India -- > print all the results --> if (Indian national anthem is present -- > click on it )
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("India");
         List<WebElement> elements =  driver.findElements(By.xpath("//ul[@role='listbox']/child::li//div[@role='option']/div/span/b"));

         for(int i=0;i<elements.size();i++)
         {

             String s =elements.get(i).getText();
             s = "India" + s;

             if(s.equalsIgnoreCase("Indian national Anthem"))

             {

             }
         }




    }
}

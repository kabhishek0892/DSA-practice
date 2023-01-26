package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindBrokenLinksSelenium {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        String urlfinal;
        driver = new ChromeDriver();
        driver.get("https://www.ajio.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
       for(int i=0;i<= links.size();i++){
           System.out.println(links.get(0).getText());
       }

       Set<String> windows = driver.getWindowHandles();
       ArrayList<String> al = new ArrayList<>(windows);
       al.get(0);



    }

}

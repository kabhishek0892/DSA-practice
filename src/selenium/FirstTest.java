package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {


    public static void main(String[] args) throws MalformedURLException {


        System.setProperty("webdriver.chrome.driver","C://headertest//chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
       WebElement element = driver.findElement(By.xpath("//*[@aria-label='Search']"));
      System.out.println(element.getLocation());

      driver.manage().timeouts();

      //driver.switchTo().frame();



Actions builder = new Actions(driver);
 builder.moveToElement(element).click().sendKeys("Hey google").
         build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
      //  js.executeScript("document.getElementById(email).value =abc");
       File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        WebDriverWait wait = new WebDriverWait(driver,10);
       }
    }



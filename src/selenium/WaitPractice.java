package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitPractice {



    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","Path of chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /**
         * Sets the amount of time to wait for an asynchronous script to finish execution before
         * throwing an error. If the timeout is negative, then the script will be allowed to run
         * indefinitely.
         */
        driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.id(" "))));

        //DEFAULT_SLEEP_TIMEOUT = 500 MILISECONDS

        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(100));
        fluentWait.pollingEvery(Duration.ofSeconds(5));
        fluentWait.ignoring(NoSuchMethodException.class);
        fluentWait.withMessage("This is fluent wait");





    }
}

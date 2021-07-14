package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RedBus {

    WebDriver driver;

    @BeforeTest
    public void LaunchURL(){
        System.setProperty("webdriver.chrome.driver", "C://headertest//chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.redbus.in/");
    }
    @Test
        public void myFirstTest() {
        driver.findElement(By.id("src")).click();
        driver.findElement(By.id("src")).sendKeys("Gay");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/Test1_Login.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='src']/parent::div/ul/li"));
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        System.out.println("Size of list is " + list.size());
        for (WebElement l : list) {
            if (l.getText().equals("Gaya")) {
                l.click();
                break;
            } else {
                System.out.println("Unable to click " + l.getText());
            }
        }
        //driver.findElement(By.id("dest")).click();
        driver.findElement(By.id("dest")).sendKeys("Patna");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        List<WebElement> destList = driver.findElements(By.xpath("//*[@id='dest']/parent::div/ul/li"));

        System.out.println("Size of destination List is "+destList.size());
       wait.until(ExpectedConditions.visibilityOf(destList.get(0)));
        wait.until(ExpectedConditions.elementToBeClickable(destList.get(0)));
        destList.get(0).click();

        driver.findElement(By.id("onward_cal")).click();
        //*[@id='rb-calendar_onward_cal']//tbody/tr[3]/td[1]
        //*[@id='rb-calendar_onward_cal']//tbody/tr[7]/td[2]
        //*[@id='rb-calendar_onward_cal']//tbody/tr[7]/td[7]
        // JavascriptExecutor js1 = (JavascriptExecutor) driver;

    }

    @AfterTest
    public void CloseBrowser() {
        driver.close();
    }
    }


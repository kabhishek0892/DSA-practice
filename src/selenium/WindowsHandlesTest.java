package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandlesTest {


WebDriver driver;

@BeforeTest
    public void setUp(){
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}

@Test
    public void lanuchURLandNavigatetoDifferentWindows() throws InterruptedException {
driver.get("https://demoqa.com/browser-windows");
    driver.findElement(By.id("windowButton")).click();
  //driver.findElement(By.id("messageWindowButton")).click();

    String MainWindow = driver.getWindowHandle();
    System.out.println("Main window handle is " + MainWindow);
    Set<String> list = driver.getWindowHandles();
    Iterator<String> it = list.iterator();
    while (it.hasNext())
    {
        String childWindow = it.next();
        if(!MainWindow.equalsIgnoreCase(childWindow)) {
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        if(driver.getTitle().contains("sample"))
        {
            String text = driver.findElement(By.id("sampleHeading")).getText();
            System.out.println("Text is "+ text);
        }
        driver.close();
    }
   // driver.switchTo().window(MainWindow);
}
}
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

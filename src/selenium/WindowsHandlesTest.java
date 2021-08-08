package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class WindowsHandlesTest {


    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void copied (){
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

    @Test(enabled = true)
    public void lanuchURLandNavigatetoDifferentWindows() throws InterruptedException {
        driver.get("http://demo.guru99.com/popup.php");
       // driver.findElement(By.xpath("//a[text() ='Click Here']")).click();
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
      /*  Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();*/
        String parentWIndow = driver.getWindowHandle();
        System.out.println("Parent window is " + parentWIndow);
       ArrayList<String> al= new ArrayList<> (driver.getWindowHandles());
       driver.switchTo().window(al.get(1));
        System.out.println(driver.getCurrentUrl());
       driver.close();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
      Iterator<String> it =windows.iterator();

      while(it.hasNext())
      {
          String child_window = it.next();
          System.out.println("Child window is " + child_window);
          if(!parentWIndow.equalsIgnoreCase(child_window))
          {
              driver.switchTo().window(child_window);
              driver.findElement(By.name("emailid"))
                      .sendKeys("gaurav@gmail.com");
              driver.close();
          }
      }
        driver.switchTo().window(parentWIndow);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

package String;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestPrac {

    public static void main(String[] args) throws FileNotFoundException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("windows.document.readyState");
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.get("https://secure.checkout.visa.com/createAccount");

        WebElement submit= driver.findElement(By.id("SubmitButton"));
        WebElement email= driver.findElement(By.id("Email"));
        WebElement TermsOfService= driver.findElement(By.linkText("TermsofService"));
        WebElement privacyNotice =driver.findElement(By.linkText("PrivacyNotice"));

/*

        FileInputStream fs = new FileInputStream("path of the excel ");
        XSSFWorkbook workbook = new XSSFWOrkBook(fs);
String fname;
String lname;
        Sheet sheet = workbook.getSheetAt(0);
       //fname & lname

        int sheet.lastRowNo = rowNo;

        for(int i=0;i<rowNo;++)

        {
            for (int j = 0; j<columns.length;i++)

            {
                Cell cell =
                      String fname =  cell.getStringValue();
                String lname = cell.getStringValue(index);

            }
        }
*/

       // driver.findElement(By.xpath("dskdsf")).sendKeys(fname);
       // driver.findElement(By.xpath("xyz")).sendKeys(lname);
        email.sendKeys("test@abc.com");

        WebElement select= driver.findElement(By.id("IdofSelect"));
        Select s = new Select(select);
        s.selectByValue("United States of America");


        boolean checked = wait.until(ExpectedConditions.elementToBeSelected(By.id(("locator of the checkbox"))));

        Assert.assertEquals(checked , true,"Remember my email is check");

        try {
            wait.until(ExpectedConditions.elementToBeClickable(TermsOfService));
            TermsOfService.click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        privacyNotice.click();

        String currentWindow = driver.getWindowHandle();
        Set<String> windows =driver.getWindowHandles();

        for(String childWindows:windows)
        {
            if(!currentWindow.equalsIgnoreCase(childWindows))
            {
                driver.switchTo().window(childWindows);
                driver.getCurrentUrl();
                driver.close();
            }
        }


        wait.until(ExpectedConditions.elementToBeClickable(submit));
         submit.click();


















    }
}

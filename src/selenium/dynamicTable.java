package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class dynamicTable {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");

        //Print Header of the table
        List<WebElement> header = driver.findElements(By.xpath("//*[@id='dataTable']/thead/tr/th"));
        for(WebElement ele:header)
        {
            System.out.println("Headers are ..........."+ele.getText());
        }

        //Print Body using two loops

       List<WebElement> rows = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr"));
        System.out.println("Size of row is "+ rows.size());
        for(WebElement row:rows)
        {
            List<WebElement> cols = row.findElements(By.tagName("td"));
           for(WebElement cellData:cols)
           {
               if(cellData.getText().equalsIgnoreCase("S&P BSE MidCap"))
               {
                  String price= cols.get(2).getText();
                   System.out.println("Last traded Price is "+ price);
                   break;
               }
           }
        }


//Using one loop only

        List<WebElement> cols = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr/td[1]"));
        System.out.println("Size of row with first columns is  "+ cols.size());
            for (int i=0;i<cols.size();i++) {
                if (cols.get(i).getText().equalsIgnoreCase("S&P BSE 200")) {
                   WebElement priceXpath = driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr["+(i+1)+"]/td[3]"));
                    System.out.println(priceXpath);
                    String price=priceXpath.getText();
                    System.out.println("Last traded Price of "+cols.get(i).getText() + "is" + price);
                    break;
                }
            }

       String beforeXpath="//*[@id='dataTable']/tbody/tr[";
        String afterXpath ="]/td[1]";

        for(int i=1;i<=5;i++)
        {
            String actualxpath = beforeXpath + i+ afterXpath ;

            WebElement element = driver.findElement(By.xpath(actualxpath));

            System.out.println(element.getText());

        }
      driver.close();

    }
}

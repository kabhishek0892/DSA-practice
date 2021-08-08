package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Raptayu {

    public static void main(String[] args) throws InterruptedException {
        By Id = By.xpath("//input[@data-id='username']");
        By password = By.xpath("//input[@data-id='password']");
        By signInButton = By.xpath("//button[@type='submit']");
        By settingIcon=By.xpath("//img[@alt='settings icon not selected']");
        By selectMap=By.xpath("//*[text()='Maps']");
        By rightArrow=By.xpath("//*[@class='rramr-list-card__footer']/button[2]");
        By editMap=By.xpath("//*[text()='Edit map']");
        By selectNode=By.xpath("//img[@alt='NODE icon not selected']");
        By zoomToFit=By.xpath("//*[text()='Zoom to fit']");
        By selectEdge=By.xpath("//img[@alt='EDGE icon not selected']");
        By selectRegion=By.xpath("//img[@alt='REGION icon not selected']");
        By selectedRegionName = By.xpath("//*[@id='root_name']");
        By save=By.xpath("//*[text()='Save changes']");




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://inst-kxjlptdjiahwffllztpgqhfn-ezdphx.ep-r.io/login");

        driver.findElement(Id).sendKeys("autobootstrap");
        driver.findElement(password).sendKeys("autobootstrap");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.findElement(signInButton).click();
        driver.findElement(settingIcon).click();
        driver.findElement(selectMap).click();
        driver.findElement(rightArrow).click();
        driver.findElement(editMap).click();
        WebElement canavas= driver.findElement(By.xpath("//div[@class='konvajs-content']"));
        driver.findElement(selectNode).click();
        driver.manage().window().maximize();
        driver.findElement(zoomToFit).click();
        Actions node1 = new Actions(driver);
        node1.moveToElement(canavas).moveByOffset(0, 50).click().build().perform();
        Actions node2 = new Actions(driver);
        System.out.println("Made first mark");
        node2.moveToElement(canavas).moveByOffset(50, 150).click().build().perform();
        System.out.println("Made second mark");
        Thread.sleep(5);
        driver.findElement(selectEdge).click();
        Actions joinnode = new Actions(driver);

        joinnode.moveToElement(canavas).moveByOffset(0,50).click().moveByOffset(50,100).click().build().perform();
        System.out.println("Clicked");

        driver.findElement(selectRegion).click();

        Actions createRegion = new Actions(driver);
       createRegion.moveToElement(canavas).moveByOffset(-50,0).clickAndHold().moveToElement(canavas).moveByOffset(75,175).release().build().perform();
        Thread.sleep(5);

        Actions clickInselectedRegion = new Actions(driver);
        clickInselectedRegion.moveToElement(canavas).moveByOffset(50,50).click().build().perform();

        driver.findElement(selectedRegionName).sendKeys("Test_1");
        driver.findElement(save).click();

        driver.findElement(editMap).click();

       WebElement rootPositionX = driver.findElement(By.id("root_pos_x"));
       Thread.sleep(3);
        //String value =rootPositionX.getAttribute("value");
        rootPositionX.clear();
        rootPositionX.sendKeys("05");
        Thread.sleep(3);
        Thread.sleep(3);
        driver.findElement(signInButton).click();
        driver.findElement(save).click();
        driver.navigate().refresh();





        //you need to release the control from the test
        //actions.MoveToElement(element).Release();
    }
    }

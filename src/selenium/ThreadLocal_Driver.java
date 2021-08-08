package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ThreadLocal_Driver {

 /*   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public WebDriver getDriver()
    {
        return this.driver.get();
    }

    public void setDriver(WebDriver driver){
        this.driver.set(driver);
    }*/
    public static void main(String[] args) {



//chrome driver (options describe the desired capabilities for chrome driver.)
//you can just use string url instead of getting from properties file
        ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
        System.setProperty("webdriver.chrome.driver","c://headertest//chromedriver.exe");
        String url = "https://google.com";
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        driver.get();

        Actions action = new Actions(driver.get());



    }
}

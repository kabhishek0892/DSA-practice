package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

//Chrome Options
/*start-maximized: Opens Chrome in maximize mode
        incognito: Opens Chrome in incognito mode
        headless: Opens Chrome in headless mode
        disable-extensions: Disables existing extensions on Chrome browser
        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
        make-default-browser: Makes Chrome default browser
        version: Prints chrome browser version
         chromeOptions.addExtensions(Path of extension)*/
public class HeadlessBrowserAndDesiredCapabilities {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--incognito");
        //Prevents Chrome from displaying the notification 'Chrome is being controlled by automated software
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.onlinesbi.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl() + " "+ driver.getTitle());
        driver.close();

        //DesriredCapabilities
        /*
ChromeOptions opt = new ChromeOptions();
opt.addExtensions(new File(“path of crx file extension”));
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
ChromeDriver driver = new ChromeDriver(capabilities);
*/


    }
}

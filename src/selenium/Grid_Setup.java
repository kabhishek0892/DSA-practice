package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

//java -jar selenium-server-standalone-3.141.59.jar -role hub  -- > To launch hub
//to launch node
//java -Dwebdriver.chrome.driver="C:\headertest\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://localhost:4444/grid/register -port 5554

public class Grid_Setup {

    @Test
    void GridSetup() {

        try {

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
            RemoteWebDriver gridDriver = new RemoteWebDriver(new URL("http://localhost:5554/wd/hub"), capabilities);
            gridDriver.get("https://www.google.com");
            System.out.println(gridDriver.getCurrentUrl());
            gridDriver.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void GridSetupUsingChromOptions() {

        try {
            ChromeOptions options = new ChromeOptions();
            RemoteWebDriver gridDriver = new RemoteWebDriver(new URL("http://localhost:5554/wd/hub"), options);
            gridDriver.get("https://www.gmail.com");
            System.out.println(gridDriver.getCurrentUrl());
            gridDriver.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}


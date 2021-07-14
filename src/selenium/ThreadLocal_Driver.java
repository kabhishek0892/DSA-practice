package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadLocal_Driver {
    public static void main(String[] args) {

        ThreadLocal<WebDriver> wbdriver = new ThreadLocal<WebDriver>();

//chrome driver (options describe the desired capabilities for chrome driver.)
//you can just use string url instead of getting from properties file
        String url = "https://google.com";
        wbdriver.set(new ChromeDriver());
        wbdriver.get().manage().window().maximize();
        wbdriver.get().get(url);

    }
}

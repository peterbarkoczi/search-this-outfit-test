package searchthisoutfit;

import Driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hook {

    public static WebDriver driver;
    String ip = System.getenv("ipaddress");

    @Before
    public void setupDriver() {
        System.out.println(ip);
//        try {
//            driver = new RemoteWebDriver(new URL("http://" + ip +":4444/wd/hub"), new ChromeOptions());
//        } catch (MalformedURLException e) {
//            System.out.println("The remote webdriver could not connect");
//            e.printStackTrace();
//        }
        driver = DriverFactory.getDriver();

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}

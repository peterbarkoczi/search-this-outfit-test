package searchthisoutfit;

import Driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.net.MalformedURLException;
import java.net.URL;

public class Hook {

    public static WebDriver driver;

    @Before
    public void setupDriver() {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub/"), new ChromeOptions());
        } catch (MalformedURLException e) {
            System.out.println("The remote webdriver could not connect");
            driver = DriverFactory.getDriver();
            e.printStackTrace();
        } catch (UnreachableBrowserException e) {
            System.out.println("The remote webdriver could not connect");
            driver = DriverFactory.getDriver();
        }


    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}

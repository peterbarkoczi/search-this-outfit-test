package searchthisoutfit.config;

import POM.Header;
import POM.MainPage;
import POM.SearchPage;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

@TestInstance(Lifecycle.PER_CLASS)
public abstract class BaseTest {

    protected WebDriver driver = Hook.driver;

    protected MainPage mainPage = new MainPage(driver);
    protected Header header = new Header(driver);
    protected SearchPage searchPage = new SearchPage(driver);

}

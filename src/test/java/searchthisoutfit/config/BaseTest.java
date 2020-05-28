package searchthisoutfit.config;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(Lifecycle.PER_CLASS)
public abstract class BaseTest {

    protected WebDriver driver = Hook.driver;
    protected WebDriverWait wait;

}

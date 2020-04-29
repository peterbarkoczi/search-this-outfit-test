package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;
    WebDriverWait wait;
    protected String ip = System.getenv("ipaddress");
    protected String port = System.getenv("port");

    public BasePage() {
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
        wait = new WebDriverWait(driver, 20);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
}

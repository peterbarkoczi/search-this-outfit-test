package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;
    WebDriverWait wait;
    String url;
    protected String ip = System.getenv("ipaddress");
    protected String port = System.getenv("port");

    public BasePage() {
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40), this);
        wait = new WebDriverWait(driver, 40);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    protected void clickOn(WebElement element) {
        element.click();
    }
}

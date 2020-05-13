package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    @FindBy(className = "title-a")
    private WebElement logo;

    public MainPage(WebDriver driver) {
        super(driver);
        this.url = "http://" + ip + ":3000/";
}

    public void navigateToMainPage() {
        navigateTo(url);
    }

    public boolean logoIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }
}

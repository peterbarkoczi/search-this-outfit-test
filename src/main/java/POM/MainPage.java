package POM;

import Utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    @FindBy(className = "title-a")
    private WebElement logo;

    @FindBy(css = "input[type=file]" )
    private WebElement chooseFileButton;

    @FindBy(className = "sidebar")
    private WebElement labels;

    public MainPage(WebDriver driver) {
        super(driver);
        this.url = "http://" + ip + ":3032/";
}

    public void navigateToMainPage() {
        navigateTo(url);
    }

    public boolean logoIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }

    public void uploadFile() {
        chooseFileButton.sendKeys(System.getenv("picturePath") + "farmer.jpg");
    }

    public boolean labelIsAppear() {
        return wait.until(ExpectedConditions.visibilityOf(labels)).isDisplayed();
    }
}

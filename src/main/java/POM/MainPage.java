package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class MainPage extends BasePage {

    @FindBy(className = "title-a")
    private WebElement logo;

    @FindBy(css = "input[type=file]" )
    private WebElement chooseFileButton;

    @FindBy(className = "sidebar")
    private WebElement labels;

    public MainPage(WebDriver driver) {
        super(driver);
        this.url = "http://localhost:3000/";
}

    public void navigateToMainPage() {
        navigateTo(url);
    }

    public boolean logoIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }

    public void uploadFile(String filename) {
        LocalFileDetector detector = new LocalFileDetector();
        String path = new File("src/test/resources/pictures/").getAbsolutePath() + "/" + filename;
        File picture = detector.getLocalFile(path);
        ((RemoteWebDriver) driver).setFileDetector(detector);
        chooseFileButton.sendKeys(picture.getAbsolutePath());
    }

    public boolean labelIsAppear() {
        return wait.until(ExpectedConditions.visibilityOf(labels)).isDisplayed();
    }
}

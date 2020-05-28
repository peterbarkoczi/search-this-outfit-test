package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PicturePage extends BasePage {

    @FindBy(xpath = "/html/body/div/div/div[3]/div/img")
    private WebElement picture;

    public PicturePage(WebDriver driver) {
        super(driver);
    }

    public boolean pictureIsAppeard() {
        return wait.until(ExpectedConditions.visibilityOf(picture)).isDisplayed();
    }
}

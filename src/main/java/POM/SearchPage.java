package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div")
    private WebElement uploadBox;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.url = "http://localhost:3000/search";
    }

    public boolean uploadBoxIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(uploadBox)).isDisplayed();
    }
}

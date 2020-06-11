package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Header extends BasePage {

    @FindBy(className = "title-a")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/a")
    private List<WebElement> navLinks;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/a[1]")
    private WebElement homeLink;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")
    private WebElement searchLink;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/a[3]")
    private WebElement aboutLink;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/a[4]")
    private WebElement contactsLink;

    public Header(WebDriver driver) {
        super(driver);
    }

    public boolean logoIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }

    public void clickOnHomeLink() {
        clickOn(homeLink);
    }

    public void clickOnSearchLink() {
        clickOn(searchLink);
    }

    public void clickOnAboutLink() {
        clickOn(aboutLink);
    }

    public void clickOnContactsLink() {
        clickOn(contactsLink);
    }

    public boolean navlinkIsAppeared(String navlink) {
        for (WebElement element : navLinks) {
            if (element.getText().equalsIgnoreCase(navlink)) return true;
        }
        return false;
    }

}

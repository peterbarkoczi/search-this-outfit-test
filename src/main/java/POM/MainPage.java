package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(className = "title-a")
    private WebElement logo;

    @FindBy(css = "input[type=file]" )
    private WebElement chooseFileButton;

    @FindBy(className = "sidebar")
    private WebElement labelsDiv;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/ul")
    private WebElement labelsUl;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/a[1]")
    WebElement pictureLink;

    public MainPage(WebDriver driver) {
        super(driver);
        this.url = "http://localhost:3333/";
}

    public void navigateToMainPage() {
        navigateTo(url);
    }

    public boolean logoIsAppeared() {
        return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
    }

    public void uploadFile(String filename) {
        File picture = new File("src/test/resources/pictures/" + filename);
        chooseFileButton.sendKeys(picture.getAbsolutePath());
    }

    private List<WebElement> getLabels(String xpath1, String xpath2) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath1)));
        System.out.println("Find");
        return driver.findElements(By.xpath(xpath2));
    }

    public boolean labelIsAppear() {
        List<WebElement> labels = getLabels("/html/body/div/div/div[3]/div/div/div[2]/div/ul/button[1]",
                "/html/body/div/div/div[3]/div/div/div[2]/div/ul/button");
        return labels.size() > 0;
    }

    public void clickOnLabelButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/ul/button[1]"))).click();
    }

    public boolean clothesAreAppeared() {
        List<WebElement> labels = getLabels("/html/body/div/div/div[3]/div/div/div[3]/div/ul/li[1]",
                "/html/body/div/div/div[3]/div/div/div[3]/div/ul/li");
        return labels.size() > 0;
    }

    public boolean imageIsAppeared() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("current-image")));
        WebElement image = driver.findElement(By.className("current-image"));
        return image.isDisplayed();
    }

    public void clickOnPictureLink() {
        clickOn(pictureLink);
    }

}

package searchthisoutfit.tests;

import POM.PicturePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPictureTest extends BaseTest {

    private PicturePage picturePage;

    @And("Click on picture link")
    public void clickOnPictureLink() {
        picturePage = new PicturePage(driver);
        mainPage.clickOnPictureLink();
    }

    @Then("The picture appear on the picture page")
    public void pictureIsAppeared() {
        assertTrue(picturePage.pictureIsAppeard());
    }
}

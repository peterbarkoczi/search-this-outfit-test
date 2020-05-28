package searchthisoutfit.tests;

import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

public class UploadImageTest extends BaseTest {

    @Then("The picture should appear on the screen")
    public void pictureShouldAppear() {
        mainPage.imageIsAppeared();
    }
}

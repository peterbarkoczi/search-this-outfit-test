package searchthisoutfit.tests;

import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UploadImageTest extends BaseTest {

    @Then("The picture should appear on the screen")
    public void pictureShouldAppear() {
        assertTrue(mainPage.imageIsAppeared());
    }
}

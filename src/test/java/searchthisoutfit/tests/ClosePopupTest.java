package searchthisoutfit.tests;

import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClosePopupTest extends BaseTest {

    @Then("Close the popup")
    public void closePopup() {
        mainPage.clickOnClosePopupButton();
        assertFalse(mainPage.popupIsDisappeared());
    }


}

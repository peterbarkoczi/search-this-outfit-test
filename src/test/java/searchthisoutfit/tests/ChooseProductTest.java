package searchthisoutfit.tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChooseProductTest extends BaseTest {

    @When("Click on product")
    public void clickOnProduct() {
        mainPage.clickOnProductLink();
    }

    @Then("Popup should appear")
    public void checkPopup() {
        assertTrue(mainPage.popupIsAppeared());
    }

}

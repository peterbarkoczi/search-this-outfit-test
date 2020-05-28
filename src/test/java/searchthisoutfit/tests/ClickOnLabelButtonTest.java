package searchthisoutfit.tests;

import POM.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClickOnLabelButtonTest extends BaseTest {

    @And("Click on label button")
    public void clickOnLabelButton() {
        mainPage = new MainPage(driver);
        mainPage.clickOnLabelButton();
    }


    @Then("Images should appear")
    public void imagesShouldAppear(){
        assertTrue(mainPage.clothesAreAppeared());
    }
}


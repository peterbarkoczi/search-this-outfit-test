package searchthisoutfit.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackToTheMainPageTest extends BaseTest {

    @And("Upload {string} file")
    public void uploadFile(String filename) {
        mainPage.clickOnSearchLink();
        mainPage.uploadFile(filename);
    }

    @And("Go to the pictures page")
    public void goToPicturesPage() {
        mainPage.clickOnLabelButton();
    }

    @When("Click on the logo")
    public void clickOnLogo() {
        header.clickOnLogo();
    }

    @Then("Main page should appear")
    public void mainPageIsAppeared() {
        mainPage.refreshPage();
        assertTrue(mainPage.welcomeMessageIsAppear());
    }
}

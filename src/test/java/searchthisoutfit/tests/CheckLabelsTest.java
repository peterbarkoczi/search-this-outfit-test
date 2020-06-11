package searchthisoutfit.tests;

import POM.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import searchthisoutfit.config.BaseTest;

public class CheckLabelsTest extends BaseTest {

    @And("Go to the search page")
    public void goToTheSearchPage() {
        mainPage.clickOnSearchButton();
    }

    @When("Upload a picture: {string}")
    public void uploadAPicture(String filename) {
        mainPage = new MainPage(driver);
        mainPage.uploadFile(filename);
    }

    @Then("The labels should appear")
    public void theLabelsShouldAppear() {
        Assertions.assertTrue(mainPage.labelIsAppear());
    }
}


package searchthisoutfit.tests;

import POM.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CheckLabelsTest extends BaseTest {

    private MainPage mainPage;

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


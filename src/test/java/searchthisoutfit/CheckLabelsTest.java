package searchthisoutfit;

import POM.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CheckLabelsTest extends BaseTest {

    private MainPage mainPage;

    @When("Upload a picture")
    public void uploadAPicture() {
        mainPage = new MainPage(driver);
        mainPage.uploadFile("farmer.jpg");
    }

    @Then("The labels should appear")
    public void theLabelsShouldAppear() {
        Assertions.assertTrue(mainPage.labelIsAppear());
    }
}


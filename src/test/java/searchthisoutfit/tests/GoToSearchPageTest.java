package searchthisoutfit.tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoToSearchPageTest extends BaseTest {

    @When("Go to the search page by click search link")
    public void goToTheSearchPageByClickSearchLink() {
        header.clickOnSearchLink();
    }

    @Then("The upload box should appear")
    public void theUploadBoxShouldAppear() {
        assertTrue(searchPage.uploadBoxIsAppeared());
    }
}

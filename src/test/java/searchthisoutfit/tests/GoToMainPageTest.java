package searchthisoutfit.tests;

import POM.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class GoToMainPageTest extends BaseTest {

    private MainPage mainPage;

    @Given("Open application main page")
    public void openApplicationMainPage() {
        mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
    }

    @Then("Check whether logo is appeared")
    public void checkWhetherLogoIsAppeared() {
        Assertions.assertTrue(mainPage.logoIsAppeared());
    }
}

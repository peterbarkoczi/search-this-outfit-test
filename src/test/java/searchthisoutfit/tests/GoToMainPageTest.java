package searchthisoutfit.tests;

import POM.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import searchthisoutfit.config.BaseTest;

public class GoToMainPageTest extends BaseTest {

    @Given("Open application main page")
    public void openApplicationMainPage() {
        mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
    }

    @Then("Check whether the welcome message is appeared")
    public void checkWhetherMessageIsAppeared() {
        Assertions.assertTrue(mainPage.welcomeMessageIsAppear());
    }
}

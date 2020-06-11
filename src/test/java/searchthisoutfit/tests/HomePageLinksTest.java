package searchthisoutfit.tests;

import io.cucumber.java.en.When;
import searchthisoutfit.config.BaseTest;

public class HomePageLinksTest extends BaseTest {

    @When("Click on about us link")
    public void clickOnAboutUsLink() {
        mainPage.clickOnAboutUsLink();
    }

    @When("Click on lets search it link")
    public void clickOnLetsSearchItLink() {
        mainPage.clickOnSearchLink();
    }


}

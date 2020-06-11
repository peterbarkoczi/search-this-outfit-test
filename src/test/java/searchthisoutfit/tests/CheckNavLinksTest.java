package searchthisoutfit.tests;

import POM.AboutPage;
import POM.ContactsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import searchthisoutfit.config.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckNavLinksTest extends BaseTest {

    @Then("{string} nav link should appear in header")
    public void navLinkShouldAppear(String navlink) {
        header.navlinkIsAppeared(navlink);
    }

    @When("Click on Search link")
    public void clickOnSearchLink() {
        header.clickOnSearchLink();
    }

    @Then("Search page should appear")
    public void searchPageShouldAppear() {
        assertEquals(searchPage.getUrl() ,searchPage.getCurrentUrl());
    }

    @When("Click on Home link")
    public void clickOnHomeLink() {
        header.clickOnHomeLink();
    }

    @Then("Home page should appear")
    public void homePageShouldAppear() {
        assertTrue(mainPage.welcomeMessageIsAppear());
    }

    @When("Click on About link")
    public void clickOnAboutLink() {
        header.clickOnAboutLink();
    }

    @Then("About page should appear")
    public void aboutPageShouldAppear() {
        AboutPage aboutPage = new AboutPage(driver);
        assertEquals(aboutPage.getUrl(), aboutPage.getCurrentUrl());
    }

    @When("Click on Contacts link")
    public void clickOnContactsLink() {
        header.clickOnContactsLink();
    }

    @Then("Contacts page should appear")
    public void contactsPageShouldAppear() {
        ContactsPage contactsPage = new ContactsPage(driver);
        assertEquals(contactsPage.getUrl(), contactsPage.getCurrentUrl());
    }
}

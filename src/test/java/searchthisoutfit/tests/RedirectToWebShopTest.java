package searchthisoutfit.tests;

import POM.WebShopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import searchthisoutfit.config.BaseTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedirectToWebShopTest extends BaseTest {

    String productName;
    WebShopPage webShopPage;

    @And("Go to product popup")
    public void goToProductPopup() {
        mainPage.clickOnLabelButton();
        mainPage.clickOnProductLink();
    }

    @And("Go to the product's webShop page")
    public void goToWebShop() {
        productName = mainPage.getProductName();
        mainPage.clickOnCheckProductButton();
    }

    @Then("Product page should appear on webShop")
    public void checkWebShopPage() {
        switchTab();
        webShopPage = new WebShopPage(driver);
        assertEquals(webShopPage.getProductNameFromWebShop(), productName);
    }

    private void switchTab() {
        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }
}


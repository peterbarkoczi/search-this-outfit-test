package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebShopPage extends BasePage{

    @FindBy(className = "product-brand-desc")
    private WebElement productName;

    public WebShopPage(WebDriver driver) {
        super(driver);
    }

    public String getProductNameFromWebShop() {
        return productName.getText();
    }
}

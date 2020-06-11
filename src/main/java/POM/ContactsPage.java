package POM;

import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
        this.url = "http://localhost:3000/contacts";
    }

}

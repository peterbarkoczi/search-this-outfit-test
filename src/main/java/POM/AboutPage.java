package POM;

import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage {

    public AboutPage(WebDriver driver) {
        super(driver);
        this.url = "http://localhost:3000/about";
    }
//
//    public String getUrl() {
//        return this.url;
//    }
}

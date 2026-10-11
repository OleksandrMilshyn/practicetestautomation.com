package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String url = "https://practicetestautomation.com/practice-test-login/";

    public void openLoginPage() {
        driver.get(url);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}

package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void openLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        Assert.assertFalse(loginPage.getPageTitle().isEmpty());
    }
}

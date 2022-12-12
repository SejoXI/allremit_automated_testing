package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

import static helpers.Capabilities.getAndroidDriver;
import static helpers.Capabilities.getAppiumDriver;
import static org.junit.Assert.assertTrue;

public class Login {
    private static LoginPage loginPage;

    @Before
    public void setup() {
        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null) {
            loginPage = new LoginPage(getAndroidDriver());
        } else {
            loginPage = new LoginPage(getAppiumDriver());
        }
    }

    @Test
    public void successfulLoginWithCorrectCredentials() throws InterruptedException {
        loginPage.login("jamieoli@mailinator.com", "pass1234");
        assertTrue(loginPage.loginSuccessful());
    }

    @Test
    public void failedLoginWithWrongCredentials() throws InterruptedException {
        loginPage.login("testUser1234", "pass1234");
        assertTrue(loginPage.loginFailed());
    }

    @After
    public void tearDown() {
        loginPage.afterTests();
    }
}

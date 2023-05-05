package tests;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

import static helpers.Capabilities.getAndroidDriver;
import static helpers.Capabilities.getAppiumDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Login {
    private static LoginPage loginPage;
    private final Dotenv dotenv = Dotenv.load();

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
        loginPage.login(dotenv.get("CORRECT_EMAIL"), dotenv.get("CORRECT_PASSWORD"));
        assertFalse(loginPage.loginSuccessful());
    }

    @Test
    public void failedLoginWithWrongCredentials() throws InterruptedException {
        loginPage.login(dotenv.get("WRONG_EMAIL"), dotenv.get("WRONG_PASSWORD"));
        assertTrue(loginPage.loginFailed());
    }

    @Test
    public void failedLoginWithCorrectEmailandWrongPassword() throws InterruptedException {
        loginPage.login(dotenv.get("CORRECT_EMAIL"), dotenv.get("WRONG_PASSWORD"));
        assertTrue(loginPage.loginFailed());
    }

    @Test
    public void failedLoginWithInvalidEmail() throws InterruptedException {
        loginPage.login(dotenv.get("INVALID_EMAIL"), dotenv.get("WRONG_PASSWORD"));
        assertTrue(loginPage.invalidEmail());
    }

    @After
    public void tearDown() {
        loginPage.afterTests();
    }
}

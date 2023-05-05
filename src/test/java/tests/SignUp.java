package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.SignUpPage;

import static helpers.Capabilities.getAndroidDriver;
import static helpers.Capabilities.getAppiumDriver;
import static org.junit.Assert.assertTrue;

public class SignUp {

    private static SignUpPage signUpPage;

    @Before
    public void setup() {
        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null) {
            signUpPage = new SignUpPage(getAndroidDriver());
        } else {
            signUpPage = new SignUpPage(getAppiumDriver());
        }
    }

    @Test
    public void successfulSignUpWithCorrectCredentials() {
        assertTrue(signUpPage.signUp(false, false));
    }

    @Test
    public void failedSignUpWithInvalidEmail() {
        assertTrue(signUpPage.signUp(true, false));
    }

    @Test
    public void failedSignUpWithInvalidPhoneNumber() {
        assertTrue(signUpPage.signUp(false, true));
    }

    @After
    public void tearDown() {
        signUpPage.afterTests();
    }
}

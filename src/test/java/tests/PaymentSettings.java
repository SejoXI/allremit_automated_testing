package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.PaymentSettingsPage;

import static helpers.Capabilities.getAndroidDriver;
import static helpers.Capabilities.getAppiumDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PaymentSettings {

    private PaymentSettingsPage paymentSettingsPage;

    @Before
    public void setup(){
        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null) {
            paymentSettingsPage = new PaymentSettingsPage(getAndroidDriver());
        } else {
            paymentSettingsPage = new PaymentSettingsPage(getAppiumDriver());
        }
    }

    @Test
    public void addCard(){
        assertTrue(paymentSettingsPage.addNewCard());
    }

    @Test
    public void deleteCard(){
        assertFalse(paymentSettingsPage.deleteCard(0));
    }

    @Test
    public void setCardPrimary(){
        assertTrue(paymentSettingsPage.setCardPrimary());
    }

    @After
    public void tearDown() {
        paymentSettingsPage.afterTests();
    }
}

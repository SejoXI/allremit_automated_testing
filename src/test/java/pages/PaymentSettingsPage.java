package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PaymentSettingsPage extends Page {

    public static String MASTERCARD = "MASTERCARD";
    public static String VISA = "VISA";

    Dotenv dotenv = Dotenv.load();

    //Card Elements
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"CARDS\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardsTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingActionLinkCardButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement addNewCardBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"card-number\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"month\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"year\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardYear;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"security-code\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardCVV;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardOptions2;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"self-card-submit-button\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement cardAddContinueBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingsActionDeleteButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement card1DeleteBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingsActionDeleteButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement card2DeleteBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingsEndingText\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement card1AccNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingsEndingText\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement card2AccNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CardPaymentSettingsActionSetDefaultButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement card2PrimaryBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\").text(\"YES\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement paymentDeleteYes;


    //Bank Elements
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"BANKS\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement banksTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"raas-consent-btn-continue\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement banksConsentContinueBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingActionLinkAccountButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement addNewBankBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingsActionDeleteButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bank1DeleteBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingsActionDeleteButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bank2DeleteBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingsAccountNumber\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bank1AccNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingsAccountNumber\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bank2AccNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"BankPaymentSettingsActionSetDefaultButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bank2PrimaryBtn;


    public PaymentSettingsPage(AppiumDriver driver) {
        super(driver);
        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.navigateToPaymentSettingsPage();
    }


    public String checkCard1Type() {
        String c1Text = card1AccNumber.getText();

        if (c1Text.contains("9991")) {
            return VISA;
        } else {
            return MASTERCARD;
        }
    }


    public boolean checkHasCards() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            return card1AccNumber.isDisplayed();
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            return false;
        }
    }


    public boolean checkHasBanks() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            return bank1AccNumber.isDisplayed();
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            return false;
        }
    }


    public boolean addNewCard() {
        if (checkHasCards()) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            try {
                if (card2AccNumber.isDisplayed()) {
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                    deleteCard(2);
                }
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            }

            String cardType = checkCard1Type();

            addNewCardBtn.click();
            if (cardType.equals(MASTERCARD)) {
                cardNumber.sendKeys(dotenv.get("VISA"));
            } else if (cardType.equals(VISA)) {
                cardNumber.sendKeys(dotenv.get("MASTERCARD"));
            }
        } else {
            addNewCardBtn.click();
            cardNumber.sendKeys(dotenv.get("VISA"));
        }

        cardMonth.click();
        cardOptions2.click();
        cardYear.click();
        cardOptions2.click();
        cardCVV.sendKeys("123");
        cardAddContinueBtn.click();

        try {
            Thread.sleep(5000);
            return card1AccNumber.isDisplayed();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void addNewBank() {
        banksTab.click();
        addNewBankBtn.click();
        banksConsentContinueBtn.click();
    }


    public boolean deleteCard(int position) {
        if (position == 0) {
            if (!checkHasCards()) {
                addNewCard();
            }
            card1DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return card1AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }

        } else if (position == 1) {
            card1DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return card1AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        } else if (position == 2) {
            card2DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return card2AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    public boolean deleteBank(int position) {
        banksTab.click();
        if (position == 0) {
            if (!checkHasBanks()) {
                addNewBank();
            }
            bank1DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return bank1AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }

        } else if (position == 1) {
            bank1DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return bank1AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        } else if (position == 2) {
            bank2DeleteBtn.click();
            paymentDeleteYes.click();
            try {
                Thread.sleep(5000);
                return bank2AccNumber.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    public boolean setCardPrimary() {
        if (checkHasCards()) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            try {
                if (card2AccNumber.isDisplayed()) {
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                    String oldC2Text = card2AccNumber.getText();
                    card2PrimaryBtn.click();
                    Thread.sleep(5000);
                    return oldC2Text.equals(card1AccNumber.getText());
                }
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                addNewCard();
                String oldC2Text = card2AccNumber.getText();
                card2PrimaryBtn.click();
                try {
                    Thread.sleep(5000);
                    return oldC2Text.equals(card1AccNumber.getText());
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } else {
            addNewCard();
            addNewCard();
            String oldC2Text = card2AccNumber.getText();
            card2PrimaryBtn.click();
            try {
                Thread.sleep(5000);
                return oldC2Text.equals(card1AccNumber.getText());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        return false;
    }


    public boolean setBankPrimary() {
        banksTab.click();
        if (checkHasBanks()) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            try {
                if (bank2AccNumber.isDisplayed()) {
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                    String oldB2Text = bank2AccNumber.getText();
                    bank2PrimaryBtn.click();
                    Thread.sleep(5000);
                    return oldB2Text.equals(bank1AccNumber.getText());
                }
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                addNewBank();
                String oldB2Text = bank2AccNumber.getText();
                bank2PrimaryBtn.click();
                try {
                    Thread.sleep(5000);
                    return oldB2Text.equals(bank1AccNumber.getText());
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } else {
            addNewBank();
            addNewBank();
            String oldB2Text = bank2AccNumber.getText();
            bank2PrimaryBtn.click();
            try {
                Thread.sleep(5000);
                return oldB2Text.equals(bank1AccNumber.getText());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        return false;
    }

}

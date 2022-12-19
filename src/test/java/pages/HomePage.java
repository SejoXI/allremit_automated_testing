package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"DashboardActionSendMoneyButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement sendMoneyBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"DashboardCountrySendingToPicker\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement countryChanger;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"DashbordSupportedCountryItem_0\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement ghana;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"Home\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement home;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"Transfers\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement transfers;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"Referral\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement referrals;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"Settings\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement settings;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"idx_HomeTransferTypeRadioButtonContainer_button\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement instantTransfer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"idx_HomeTransferTypeRadioButtonContainer_button\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement ACHExpress;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"HomeTransferTypeContinueButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement transferTypeContinueBtn;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }
}

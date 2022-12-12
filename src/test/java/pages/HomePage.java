package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SendMoneySendButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement sendMoneyBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SendMoneyChangeCountryTouchable\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement countryChanger;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginIdentifierInpu\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement home;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginIdentifierInp\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement transfers;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginIdentifierIn\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement referrals;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginIdentifierI\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement settings;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }
}

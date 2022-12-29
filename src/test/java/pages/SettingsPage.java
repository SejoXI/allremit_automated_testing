package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SettingsActionLogoutButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement signOutBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SettingsAction_Payment Settings\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement paymentSettingsOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SettingsAction_Increase Limits\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement increaseLimitOption;

    public SettingsPage(AppiumDriver driver) {
        super(driver);
        HomePage homePage = new HomePage(driver);
        homePage.navigateToSettingsPage();
    }

    public void navigateToPaymentSettingsPage(){
        paymentSettingsOption.click();
    }

    public void navigateToIncreaseLimitsPage(){
        increaseLimitOption.click();
    }

    public boolean signOut(){
        signOutBtn.click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.username.isDisplayed();
    }
}

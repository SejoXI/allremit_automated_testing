package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {

    HomePage homePage;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginIdentifierInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement username;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginPasswordInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement password;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"loginbtn\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement loginBtn;


    public LoginPage(AppiumDriver driver) {
        super(driver);
        StarterPage starterPage = new StarterPage(driver);
        homePage = new HomePage(driver);
        starterPage.navigateToLoginScreen();
    }

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();

    }

    public boolean loginSuccessful() throws InterruptedException {
        Thread.sleep(10000);
        return homePage.sendMoneyBtn.isDisplayed();
    }

    public boolean loginFailed() throws InterruptedException {
        Thread.sleep(2000);
        return username.isDisplayed();
    }
}

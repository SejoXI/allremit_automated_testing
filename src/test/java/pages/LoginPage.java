package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"LoginIdentifierInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement username;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"LoginPasswordInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement password;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"LoginActionButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement loginBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Enter email address or phone number\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement emailError;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/alertTitle\").text(\"INVALID CREDENTIALS\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement credentialsError;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement alertOk;


    public LoginPage(AppiumDriver driver) {
        super(driver);
        StarterPage starterPage = new StarterPage(driver);
        starterPage.navigateToLoginScreen();
    }

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }

    public boolean loginSuccessful() throws InterruptedException {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try{
            return loginBtn.isDisplayed();
        }catch (Exception e){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            return false;
        }
    }

    public boolean loginFailed() throws InterruptedException {
        Thread.sleep(10000);
        boolean result = credentialsError.isDisplayed();
        alertOk.click();
        return result;
    }

    public boolean invalidEmail() throws InterruptedException {
        Thread.sleep(1000);
        return emailError.isDisplayed();
    }
}

package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class StarterPage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"OnBoardLoginBtn\")")
    WebElement loginBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"OnBoardSignUpBtn\")")
    WebElement signupBtn;

    public StarterPage(AppiumDriver driver) {
        super(driver);
    }

    public void navigateToLoginScreen() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        loginBtn.click();
    }

    public void navigateToSignUpScreen() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        signupBtn.click();
    }
}

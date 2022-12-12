package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SignUpPage extends Page {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpFirstNameInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement firstName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpLastNameInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement lastName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"dobTouchable16\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement dob;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement dobConfirmBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpDropgender\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement gender;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"male\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement genderMale;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"female\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement genderFemale;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpAddressInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement address;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpDropDownState\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement state;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpCityInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement city;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpZipCodeInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement zipcode;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement continueBtn;

    public SignUpPage(AppiumDriver driver) {
        super(driver);
    }


}

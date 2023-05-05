package pages;

import helpers.random.Result;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static helpers.UserGenerator.generateUser;

public class SignUpPage extends Page {

    HomePage homePage;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpFirstNameInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement firstName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signUpLastNameInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement lastName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpActionOpenDateOfBirth\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement dob;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement dobConfirmBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpGenderPicker\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement gender;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"male\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement genderMale;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"female\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement genderFemale;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpAddressInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement address;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpDropDownState\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement state;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpCityInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement city;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpZipCodeInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement zipcode;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"SignUpActionContinueButton\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement continueBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpEmailInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement emailAddress;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpPhoneNumberInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement phone;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpPasswordInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement password;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpConfirmPasswordInput\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement confirmPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpConsentTouchableIcon\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement consentBtn;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"SignUpActionSubmitButton\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement signUpSubmitBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement alertOkBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpVerifyOTPCodeField\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement smsOTPField;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpVerifyOTPSubmitButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement verifySMSBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpVerifyEmailOTPCodeField\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement emailOTPField;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"SignUpVerifyEmailOTPSubmitButton\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement verifyEmailBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Please enter valid Email\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement emailError;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/message\").text(\"\n" +
            "mobile_phone Invalid mobile number\n" +
            "Validation Errors\n\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement phoneError;


    public SignUpPage(AppiumDriver driver) {
        super(driver);
        StarterPage starterPage = new StarterPage(driver);
        homePage = new HomePage(driver);
        starterPage.navigateToSignUpScreen();
    }

    public boolean signUp(boolean useInvalidEmail, boolean useInvalidPhone) {
        if (useInvalidEmail) {
            return signUpWithInvalidEmail();
        } else if (useInvalidPhone) {
            return signUpWithInvalidPhone();
        } else {
            return signUpWithValidData();
        }
    }

    public boolean signUpWithValidData() {
        try {
            Result user = generateUser();

            //Set first name and last name
            firstName.sendKeys(user.getName().getFirst());
            lastName.sendKeys(user.getName().getLast());

            //Select date of birth
            dob.click();
            dobConfirmBtn.click();

            //Select gender
            gender.click();
            if (user.getGender().equals("male")) {
                genderMale.click();
            } else {
                genderFemale.click();
            }

            //Enter address
            address.sendKeys(
                    user.getLocation().getStreet().getNumber().toString()
                            + " " +
                            user.getLocation().getStreet().getName()
                            + ", " +
                            user.getLocation().getCity()
                            + ", " +
                            user.getLocation().getState()
                            + " " +
                            user.getLocation().getPostcode()
                            + ", USA"
            );

            //Select state
            state.click();
            String platformName = driver.getCapabilities().getPlatformName().name();
            if (platformName.equalsIgnoreCase("ANDROID")) {
                driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(1)).scrollIntoView(" +
                                "new UiSelector().text(\"" + user.getLocation().getState() + "\"))"
                )).click();
            } else {
                //Use IOS selector to find state element
            }


            //Enter city
            city.sendKeys(user.getLocation().getCity());

            //Enter zip code
            zipcode.sendKeys(user.getLocation().getPostcode().toString());

            //Move to next page
            continueBtn.click();

            //Enter email address
            emailAddress.sendKeys(user.getEmail());

            //Enter phone number
            String userPhone = user.getPhone().replace("(", " ");
            userPhone = userPhone.replace(")", " ");
            userPhone = userPhone.replace("-", " ");
            userPhone = userPhone.replace(" ", "");
            phone.sendKeys(userPhone);

            //Enter password
            password.sendKeys("pass1234");
            confirmPassword.sendKeys("pass1234");

            //Agree to T&C
            consentBtn.click();

            //Continue to SMS OTP
            signUpSubmitBtn.click();

            //Verify SMS OTP
            alertOkBtn.click();
            smsOTPField.sendKeys("000000");
            verifySMSBtn.click();

            //Verify Email OTP
            emailOTPField.sendKeys("000000");
            verifyEmailBtn.click();

            return homePage.sendMoneyBtn.isDisplayed();

        } catch (IOException e) {
            new RuntimeException(e).printStackTrace();
            return false;
        }
    }

    public boolean signUpWithInvalidEmail() {
        try {
            Result user = generateUser();

            //Set first name and last name
            firstName.sendKeys(user.getName().getFirst());
            lastName.sendKeys(user.getName().getLast());

            //Select date of birth
            dob.click();
            dobConfirmBtn.click();

            //Select gender
            gender.click();
            if (user.getGender().equals("male")) {
                genderMale.click();
            } else {
                genderFemale.click();
            }

            //Enter address
            address.sendKeys(
                    user.getLocation().getStreet().getNumber().toString()
                            + " " +
                            user.getLocation().getStreet().getName()
                            + ", " +
                            user.getLocation().getCity()
                            + ", " +
                            user.getLocation().getState()
                            + " " +
                            user.getLocation().getPostcode()
                            + ", USA"
            );

            //Select state
            state.click();
            String platformName = driver.getCapabilities().getPlatformName().name();
            if (platformName.equalsIgnoreCase("ANDROID")) {
                driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(1)).scrollIntoView(" +
                                "new UiSelector().text(\"" + user.getLocation().getState() + "\"))"
                )).click();
            } else {
                //Use IOS selector to find state element
            }

            //Enter city
            city.sendKeys(user.getLocation().getCity());

            //Enter zip code
            zipcode.sendKeys(user.getLocation().getPostcode().toString());

            //Move to next page
            continueBtn.click();

            //Enter email address
            emailAddress.sendKeys("invalidemail");

            //Enter phone number
            String userPhone = user.getPhone().replace("(", " ");
            userPhone = userPhone.replace(")", " ");
            userPhone = userPhone.replace("-", " ");
            userPhone = userPhone.replace(" ", "");
            phone.sendKeys(userPhone);

            //Enter password
            password.sendKeys("password");
            confirmPassword.sendKeys("password");

            //Agree to T&C
            consentBtn.click();

            //Continue to SMS OTP
            signUpSubmitBtn.click();

            Thread.sleep(1000);

            return emailError.isDisplayed();

        } catch (IOException | InterruptedException e) {
            new RuntimeException(e).printStackTrace();
            return false;
        }
    }

    public boolean signUpWithInvalidPhone() {
        try {
            Result user = generateUser();

            //Set first name and last name
            firstName.sendKeys(user.getName().getFirst());
            lastName.sendKeys(user.getName().getLast());

            //Select date of birth
            dob.click();
            dobConfirmBtn.click();

            //Select gender
            gender.click();
            if (user.getGender().equals("male")) {
                genderMale.click();
            } else {
                genderFemale.click();
            }

            //Enter address
            address.sendKeys(
                    user.getLocation().getStreet().getNumber().toString()
                            + " " +
                            user.getLocation().getStreet().getName()
                            + ", " +
                            user.getLocation().getCity()
                            + ", " +
                            user.getLocation().getState()
                            + " " +
                            user.getLocation().getPostcode()
                            + ", USA"
            );

            //Select state
            state.click();
            String platformName = driver.getCapabilities().getPlatformName().name();
            if (platformName.equalsIgnoreCase("ANDROID")) {
                driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(1)).scrollIntoView(" +
                                "new UiSelector().text(\"" + user.getLocation().getState() + "\"))"
                )).click();
            } else {
                //Use IOS selector to find state element
            }


            //Enter city
            city.sendKeys(user.getLocation().getCity());

            //Enter zip code
            zipcode.sendKeys(user.getLocation().getPostcode().toString());

            //Move to next page
            continueBtn.click();

            //Enter email address
            emailAddress.sendKeys(user.getEmail());

            //Enter phone number
            phone.sendKeys("123456789");

            //Enter password
            password.sendKeys("pass1234");
            confirmPassword.sendKeys("pass1234");

            //Agree to T&C
            consentBtn.click();

            //Continue to SMS OTP
            signUpSubmitBtn.click();

            Thread.sleep(2000);

            return phoneError.isDisplayed();

        } catch (IOException | InterruptedException e) {
            new RuntimeException(e).printStackTrace();
            return false;
        }
    }
}

package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class IncreaseLimitsPage extends Page {

    Dotenv dotenv = Dotenv.load();

    //Increase Limit Table Tabs
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit1;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab1Value\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit1CurrentValue;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab2\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit2;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab2Value\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit2CurrentValue;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab3\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit3;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"IncreaseLimitsActionLimitTab3Value\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement limit3CurrentValue;


    //Apply button for Increase Limit
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"IncreaseLimitsActionApplyButton\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement applyBtn;


    //Instruction Page Understand Button
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"IdentityVerificationActionButton\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement understandBtn;


    //Permissions IDs
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_one_time_button\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement permissionOneTimeBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement permissionAllowBtn;


    //Limit 2 IDs
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"full_SSN\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement fullSSNInput;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"id_number\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idNumber;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"id_issuing_authority\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idIssuingAuthority;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"Alaska\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement alaska;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"id_expiry_year\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idExpiryYear;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement nextYear;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"id_expiry_month\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idExpiryMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"January\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement january;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"id_expiry_day\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idExpiryDay;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"2\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement day2;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"document_type\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement idType;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"Passport\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement passport;


    //Document Selection IDs
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement filesOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\").description(\"Show roots\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement rootBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CompoundButton\").text(\"Images\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement imagesClip;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").resourceId(\"android:id/button1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement ocrOkBtn;


    //Limit 3 IDs
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"occupation\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement occupation;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"company_name\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement companyName;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement companyAddress;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"company_phone\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement companyPhone;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"sourceOfIncome\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement sourceOfIncome;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"Salary\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement salary;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"additional_document_type\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement sourceOfFund;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\").text(\"Bank Statement\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement bankStatement;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"additional_document_file\"))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement browseField;


    //Limit Submit Btn and Remit Box
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement submitBtn;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(1))")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement submitBtnL3;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"remit-box\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`name == 'Foo'`]")
    WebElement remitBox;

    public IncreaseLimitsPage(AppiumDriver driver) {
        super(driver);
        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.navigateToIncreaseLimitsPage();
    }


    private void pushFileToDevice(String remotePath, String pathname) {
        try {
            if (driver.getCapabilities().getPlatformName().is(Platform.ANDROID)) {
                ((AndroidDriver) driver).pushFile(remotePath, new File(pathname));
            } else if (driver.getCapabilities().getPlatformName().is(Platform.IOS)) {
                ((IOSDriver) driver).pushFile(remotePath, new File(pathname));
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void selectImageFile(String imageFileName) {
        //filesOption.click();
        rootBtn.click();

        if (driver.getCapabilities().getPlatformName().is(Platform.ANDROID)) {
            /*driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(0)).scrollIntoView(" +
                            "new UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/title\").text(\""+driver.getCapabilities().getCapability("deviceName")+"\"))"
            )).click();*/

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(0)).scrollIntoView(" +
                            "new UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/title\").text(\"Nokia 3.2\"))"
            )).click();

            imagesClip.click();

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(0)).scrollIntoView(" +
                            "new UiSelector().resourceId(\"android:id/title\").className(\"android.widget.TextView\").text(\"" + imageFileName + "\"))"
            )).click();
        } else {
            //Use IOS selector to find state element
        }
    }

    private void allowPermissions() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            permissionOneTimeBtn.click();
            permissionAllowBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }
    }


    public int checkCurrentLimit() {
        try {
            if (limit1CurrentValue.isDisplayed()) {
                return 1;
            }
        } catch (Exception e) {
            try {
                if (limit2CurrentValue.isDisplayed()) {
                    return 2;
                }
            } catch (Exception ex) {
                return 3;
            }
        }
        return 3;
    }

    public void fillLimit2Form() {

        //Push document file to device
        pushFileToDevice("sdcard/Download/document_verified.jpg", "src/test/resources/document_verified.jpg");

        fullSSNInput.sendKeys(dotenv.get("FULL_SSN"));
        idNumber.sendKeys(dotenv.get("ID_NUMBER"));
        idIssuingAuthority.click();
        alaska.click();
        idExpiryYear.click();
        nextYear.click();
        idExpiryMonth.click();
        january.click();
        idExpiryDay.click();
        day2.click();
        idType.click();
        passport.click();

        selectImageFile("document_verified.jpg");

        submitBtn.click();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void fillLimit3Form() {
        //Push document file to device
        pushFileToDevice("sdcard/Download/document_verified.jpg", "src/test/resources/document_verified.jpg");

        occupation.sendKeys(dotenv.get("OCCUPATION"));
        companyName.sendKeys(dotenv.get("COMPANY_NAME"));
        companyAddress.sendKeys(dotenv.get("COMPANY_ADDRESS"));
        companyPhone.sendKeys(dotenv.get("COMPANY_PHONE"));
        sourceOfIncome.click();
        salary.click();
        sourceOfFund.click();
        bankStatement.click();
        browseField.click();

        selectImageFile("document_verified.jpg");

        submitBtnL3.click();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean applyForLimit2() {
        limit2.click();
        applyBtn.click();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        understandBtn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            Thread.sleep(5000L);
            if (remitBox.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException | InterruptedException e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            fillLimit2Form();
        }

        return remitBox.isDisplayed();
    }

    public boolean applyForLimit3() {
        limit3.click();
        applyBtn.click();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        understandBtn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            Thread.sleep(5000L);
            if (remitBox.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException | InterruptedException e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            fillLimit3Form();
        }

        return remitBox.isDisplayed();
    }

    public boolean pseudoLimit3() {
        limit2.click();
        applyBtn.click();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        understandBtn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            Thread.sleep(5000L);
            if (remitBox.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException | InterruptedException e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            fillLimit3Form();
        }

        return remitBox.isDisplayed();
    }
}

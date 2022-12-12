package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static helpers.Config.stopService;

public class Page {

    protected AppiumDriver driver;

    public Page(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void afterTests() {
        driver.quit();
        stopService();
    }
}

package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Capabilities extends Config {

    private static final String DEFAULT_ANDROID_PLATFORM_VERSION = "11";
    private static final String DEFAULT_IOS_PLATFORM_VERSION = "14.5";
    private static final String DEFAULT_ANDROID_DEVICE_NAME = "Nokia 3.2";
    private static final String DEFAULT_IOS_DEVICE_NAME = "iPhone 12";
    private static final int DEFAULT_APPIUM_PORT = 4723;
    private static final String DEFAULT_APPIUM_HOST = "localhost";

    private static AndroidDriver androidDriver;
    private static IOSDriver iosDriver;

    public Capabilities() {

    }

    public static void setupAndroidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null) {
            startService();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("deviceName", "Nokia 3.2");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("appPackage", "com.allremit");
            capabilities.setCapability("appActivity", ".MainActivity");

            androidDriver = new AndroidDriver(getServiceUrl(), capabilities);
        } else {
            try {
                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                androidDriver = new AndroidDriver(url, capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void setupIosCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null) {
            startService();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("deviceName", "Nokia 3.2");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("appPackage", "com.allremit");
            capabilities.setCapability("appActivity", ".MainActivity");

            iosDriver = new IOSDriver(getServiceUrl(), capabilities);
        } else {
            try {
                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                iosDriver = new IOSDriver(url, capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static AndroidDriver getAndroidDriver() {
        setupAndroidCapabilities();
        return androidDriver;
    }

    private static IOSDriver getIosDriver() {
        setupIosCapabilities();
        return iosDriver;
    }

    public static AppiumDriver getAppiumDriver() {
        if (Objects.equals(System.getenv("DEVICEFARM_DEVICE_PLATFORM_NAME"), "Android")) {
            return getAndroidDriver();
        } else {
            return getIosDriver();
        }
    }
}

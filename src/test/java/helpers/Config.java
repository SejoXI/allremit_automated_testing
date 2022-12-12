package helpers;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.URL;

public class Config {

    private static AppiumDriverLocalService service;

    public Config() {

    }

    public static void startService() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.withBasePath("/wd/hub/");
        service.start();
    }

    public static void stopService() {
        if (service != null) {
            service.stop();
        }
    }

    public static URL getServiceUrl() {
        return service.getUrl();
    }
}

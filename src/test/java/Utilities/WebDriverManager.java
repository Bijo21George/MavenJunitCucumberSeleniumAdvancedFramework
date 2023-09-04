package Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverManager {
    private static WebDriver webDriver;
    private static AppiumDriver<MobileElement> mobileDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver driver1) {
        webDriver = driver1;
    }

    public static AppiumDriver<MobileElement> getAndroidDriver() {
        return mobileDriver;
    }

    public static void setAndroidDriver(AppiumDriver<MobileElement> mobileDriver1) {
        mobileDriver = mobileDriver1;
    }

}

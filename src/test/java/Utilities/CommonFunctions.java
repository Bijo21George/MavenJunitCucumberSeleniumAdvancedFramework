package Utilities;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions {
    //public static WebElement element;
    public static void explicitWait(WebElement element)
    {

        if(ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("web"))
        {
            WebDriverWait wait=new WebDriverWait(WebDriverManager.getWebDriver(),10);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        else
        {
            WebDriverWait wait=new WebDriverWait(WebDriverManager.getAndroidDriver(),10);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public static void getScroll(WebElement element)
    {
            JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getWebDriver();
            js.executeScript("arguments[0].scrollIntoView();", element);
    }
/*
        String str=element.getText();
            WebElement list= WebDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+str+"\"));"));
            WebDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().contains(str));"));
            WebDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + str + "\"));"));
            WebDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))"));
            WebDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+").instance(0))"));
*/



    public static void scrollDownMobile() throws InterruptedException {
        Thread.sleep(5000);
        Dimension dimension=WebDriverManager.getAndroidDriver().manage().window().getSize();
        int x=(int)(dimension.getWidth()*0.4);
        int y1=(int)(dimension.getHeight()*0.8);
        int y2=(int)(dimension.getHeight()*0.5);
        TouchAction touchAction=new TouchAction(WebDriverManager.getAndroidDriver());
        touchAction.press(PointOption.point(x,y2))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(x,y1))
                .release().perform();
    }

    public static void scrollUpMobile()
    {
        Dimension dimension=WebDriverManager.getAndroidDriver().manage().window().getSize();
        int scrollEnd=(int)(dimension.getHeight()*0.8);
        int scrollStart=(int)(dimension.getHeight()*0.5);
        TouchAction touchAction=new TouchAction(WebDriverManager.getAndroidDriver());
        touchAction.press(PointOption.point(0,scrollEnd))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(0,scrollStart))
                .release().perform();
    }
}

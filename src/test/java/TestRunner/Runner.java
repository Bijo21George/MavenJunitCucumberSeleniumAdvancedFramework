package TestRunner;

import Utilities.ConfigReader;
import Utilities.WebDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",glue = "stepDefinitions",plugin={"pretty"},tags="@MobileScenario")

public class Runner {
    //ConfigReader configReader=new ConfigReader();
   // public static WebDriver driver;
    @BeforeClass
    public static void setUpDriver(){
        if(ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Web"))
        {
            System.setProperty("webdriver.edge.driver","C:\\software\\edgedriver_win64\\msedgedriver.exe");
            WebDriverManager.setWebDriver(new EdgeDriver());
        }
        else if(ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Android"))
        {
            DesiredCapabilities caps=new DesiredCapabilities();
            caps.setCapability("platformName",ConfigReader.config().getProperty("PlatformName"));
            caps.setCapability("platormVersion",ConfigReader.config().getProperty("PlatformVersion"));
            caps.setCapability("deviceName",ConfigReader.config().getProperty("DeviceName"));
            caps.setCapability("appPackage",ConfigReader.config().getProperty("AppPackage"));
            caps.setCapability("appActivity",ConfigReader.config().getProperty("AppActivity"));
            try {
                WebDriverManager.setAndroidDriver(new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }


   @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
//        WebDriverManager.getWebDriver().quit();
    }
}

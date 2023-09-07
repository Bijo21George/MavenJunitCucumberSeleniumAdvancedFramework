package PageFactoryClass;

import Utilities.CommonFunctions;
import io.appium.java_client.AppiumDriver;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSteps;

public class HomePageMobile {

    public HomePageMobile(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOPNAV_CAROUSEL_1_1']/android.view.ViewGroup")
    //@iOSXCUITFindBy(xpath = "//*[@text='Studio']")
    MobileElement menscategory;
    public MobileElement getMensCtegoru(){
        return menscategory;
    }


    public void homePage() {
        System.out.println("User is on Myntra HomePage");
    }

    public void menPage() {
        CommonFunctions.explicitWait(menscategory);
        getMensCtegoru().click();
    }


}

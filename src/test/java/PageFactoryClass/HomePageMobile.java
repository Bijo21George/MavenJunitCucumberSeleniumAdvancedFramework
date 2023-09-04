package PageFactoryClass;

import io.appium.java_client.AppiumDriver;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSteps;

public class HomePageMobile {

    public HomePageMobile(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        
    }

    @AndroidFindBy(xpath = "//*[@resource-id='TOPNAV_CAROUSEL_1_2']")
    @iOSXCUITFindBy(xpath = "//*[@text='Studio']")
    MobileElement menscategory;
    public MobileElement getMensCtegoru(){
        return menscategory;
    }


    public void homePage() {
        System.out.println("User is on Myntra HomePage");
    }

    public void menPage() {
        getMensCtegoru().click();
    }

}

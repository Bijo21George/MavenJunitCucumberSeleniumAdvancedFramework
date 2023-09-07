package stepDefinitions;
import PageFactoryClass.*;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    public HomePageWeb homePageWeb;
    public PersonalLoanWeb personalLoanWeb;
    public PersonalLoanFinalPageWeb personalLoanFinalPageWeb;
    public HomePageMobile homePageMobile;
    public MenCategoryMobile menCategoryMobile;
    public TrousersPageMobile trousersPageMobile;

    public void setUpScreen(WebDriver driver) {
        homePageWeb = new HomePageWeb(driver);
        personalLoanWeb = new PersonalLoanWeb(driver);
        personalLoanFinalPageWeb =new PersonalLoanFinalPageWeb(driver);
    }

    public void setUpMobileScreen(AppiumDriver appiumDriver)
    {
        homePageMobile=new HomePageMobile(appiumDriver);
        menCategoryMobile=new MenCategoryMobile(appiumDriver);
        trousersPageMobile=new TrousersPageMobile(appiumDriver);
    }

}

package stepDefinitions;

//import PageFactoryClass.HomePageMobile;

import Utilities.ConfigReader;
import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefMobile extends BaseSteps {

    @Before
    public void setUpHomePageStepDefMobile() {
        if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Web")) {
            setUpScreen(WebDriverManager.getWebDriver());
        } else if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("android")) {
            setUpMobileScreen(WebDriverManager.getAndroidDriver());
        }
    }

    @Given("User is on Myntra Homepage")
    public void userIsOnMyntraHomepage() {
        homePageMobile.homePage();

    }

    @When("User selects Men")
    public void userSelectsMen() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePageMobile.menPage();
    }
}

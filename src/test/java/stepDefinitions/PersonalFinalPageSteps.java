package stepDefinitions;

import Utilities.ConfigReader;
import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class PersonalFinalPageSteps extends BaseSteps {

    @Before
    public void setUpPersonalLoanPageSteps() {
        if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Web")) {
            setUpScreen(WebDriverManager.getWebDriver());
        } else if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("android")) {
            setUpMobileScreen(WebDriverManager.getAndroidDriver());
        }
    }

    @Then("personal loan details second page is opened")
    public void personalLoanDetailsSecondPageIsOpened() {
        personalLoanFinalPageWeb.setVerifyPage();
    }
}


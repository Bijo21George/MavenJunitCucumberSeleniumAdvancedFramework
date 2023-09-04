package stepDefinitions;

import Utilities.ConfigReader;
import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class PersonalLoanSteps extends BaseSteps {

    @Before
    public void setUpPersonalLoanPageSteps() {
        if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Web")) {
            setUpScreen(WebDriverManager.getWebDriver());
        } else if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("android")) {
            setUpMobileScreen(WebDriverManager.getAndroidDriver());
        }
    }

    @When("user enters loan details")
    public void userEntersLoanDetails() {
        personalLoanWeb.enterLoanAmount();
        personalLoanWeb.enterTenure();
        personalLoanWeb.enterInterestRate();
    }

    @And("clicks on Apply now")
    public void userClicksOnApplyNow() {
        personalLoanWeb.clickOnApplyNow();
        personalLoanWeb.switchWindow();
    }
}

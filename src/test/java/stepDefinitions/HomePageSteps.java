package stepDefinitions;

import Utilities.ConfigReader;
import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseSteps {

    @Before
    public void setUpHomePageSteps() {
        if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("Web")) {
            setUpScreen(WebDriverManager.getWebDriver());
        } else if (ConfigReader.config().getProperty("PlatformName").equalsIgnoreCase("android")) {
            setUpMobileScreen(WebDriverManager.getAndroidDriver());
        }
    }

    @Given("User is on ICICIbank homepage")
    public void userIsOnICICIbankHomepage() {
        homePageWeb.launchHomePage();
    }

    @When("user hovers on loans")
    public void userHoversOnLoans() {
        homePageWeb.hoverOnLoans();
    }

    @Then("user clicks on personal loan")
    public void userClicksOnPersonalLoan() {
        homePageWeb.clickOnPersonalLoan();
    }

}

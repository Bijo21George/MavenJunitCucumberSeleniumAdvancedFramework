package stepDefinitions;

import PageFactoryClass.TrousersPageMobile;
import Utilities.CommonFunctions;
import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrousersStepDefMobile extends BaseSteps {

    @Before
    public void setUpTrousersStepDefMobile()
    {
        setUpMobileScreen(WebDriverManager.getAndroidDriver());
    }

    @Then("Trousers are displayed")
    public void trousersAreDisplayed() {
        trousersPageMobile.verifyTrouserPageDisplayed();
    }

    @When("User selects first trouser")
    public void userSelectsFirstTrouser() {
        trousersPageMobile.selectFirstTrouser();
    }

    @And("User selects size")
    public void userSelectsSize() {
        trousersPageMobile.selectSize();
    }

    @And("Adds product to Bag")
    public void addsProductToBag() {
        trousersPageMobile.selectAddToBag();
    }

    @And("User clicks on Done")
    public void userClicksOnDone() {
        trousersPageMobile.clickDone();
    }

    @Then("GotoBag button is selected")
    public void gotobagButtonIsSelected() throws InterruptedException {
        trousersPageMobile.selectGoToBag();
    }


}


package PageFactoryClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSteps;

public class TrousersPageMobile {
    public TrousersPageMobile(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='image_image_container'])[1]/android.view.ViewGroup/android.widget.ImageView")
    WebElement firstTrouser;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='size_select_2']/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    WebElement sizeTrouser;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='buy_button']/android.view.ViewGroup/android.widget.TextView")
    WebElement addToBag;

    @AndroidFindBy(xpath = "//*[contains(@text,'GO TO BAG')]")
    WebElement goToBag;

    public void verifyTrouserPageDisplayed() {
        Assert.assertTrue(firstTrouser.isDisplayed());
        System.out.println("Trouser page displayed");
    }

    public void selectFirstTrouser() {
        firstTrouser.click();
    }

    public void selectSize() {
        sizeTrouser.click();
    }

    public void selectAddToBag() {
        addToBag.click();
    }

    public void selectGoToBag() {
        Assert.assertTrue(goToBag.isDisplayed());
        System.out.println("Verified the cart");
    }
}

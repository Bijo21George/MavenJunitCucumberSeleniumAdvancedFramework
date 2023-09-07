
package PageFactoryClass;

import Utilities.CommonFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSteps;

import static Utilities.CommonFunctions.getScroll;

public class TrousersPageMobile {
    public TrousersPageMobile(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='image_image_container'])[1]/android.view.ViewGroup/android.widget.ImageView")
    MobileElement firstTrouser;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='size_select_1']/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    MobileElement sizeTrouser;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='buy_button']/android.view.ViewGroup/android.widget.TextView")
    MobileElement addToBag;

    @AndroidFindBy(xpath = "//*[contains(@text,'GO TO BAG')]")
    MobileElement goToBag;

    @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc='buy_done_button']/android.view.ViewGroup/android.widget.TextView" )
    MobileElement doneButton;

    public void verifyTrouserPageDisplayed() {
        CommonFunctions.explicitWait(firstTrouser);
        Assert.assertTrue(firstTrouser.isDisplayed());
        System.out.println("Trouser page displayed");
    }

    public void selectFirstTrouser() {
        firstTrouser.click();
    }


    public void selectSize() {
        CommonFunctions.explicitWait(sizeTrouser);
        sizeTrouser.click();
    }

    public void selectAddToBag() {
        CommonFunctions.explicitWait(addToBag);
        addToBag.click();
    }

    public void clickDone()
    {
        doneButton.click();
        //CommonFunctions.explicitWait(goToBag);
    }
    public void selectGoToBag() throws InterruptedException {
        Thread.sleep(10000);
        CommonFunctions.scrollDownMobile();
        Thread.sleep(10000);
        CommonFunctions.scrollDownMobile();
        Thread.sleep(10000);
        CommonFunctions.explicitWait(goToBag);

        if(goToBag.isDisplayed())
        {
            System.out.println("Order placed");
        }
        else
            System.out.println("Order not placed");
    }

}

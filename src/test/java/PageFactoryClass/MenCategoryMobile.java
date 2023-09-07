
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

//import java.sql.SQLOutput;

public class MenCategoryMobile {

    public MenCategoryMobile(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='19:23d28ba5-ffb3-4f65-ba6d-5daf83c5dc30&64bcde8391daaccf4d5ef1fe']/android.view.ViewGroup/android.widget.ImageView")
    MobileElement trousers;

    public void menPageDisplayed() {
        CommonFunctions.explicitWait(trousers);
        //Assert.assertTrue(trousers.isDisplayed());
        System.out.println("Mens page displayed");
    }

    public void clickOnTrousers() {
        trousers.click();
    }
}


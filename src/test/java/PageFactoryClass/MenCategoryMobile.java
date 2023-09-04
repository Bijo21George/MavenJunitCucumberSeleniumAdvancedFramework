
package PageFactoryClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSteps;

import java.sql.SQLOutput;

public class MenCategoryMobile {

    public MenCategoryMobile(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOPNAV_CAROUSEL_1_1']/android.view.ViewGroup")
    WebElement trousers;

    public void menPageDisplayed() {
        Assert.assertTrue(trousers.isDisplayed());
        System.out.println("Mens page displayed");
    }

    public void clickOnTrousers() {
        trousers.click();
    }
}


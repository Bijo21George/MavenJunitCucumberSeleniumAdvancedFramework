package PageFactoryClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalLoanFinalPageWeb {

    public PersonalLoanFinalPageWeb(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='loanDetailsCard']")
    WebElement verifyPage;

    public void setVerifyPage()
    {
        Assert.assertTrue("Page verified",verifyPage.isDisplayed());
    }
}

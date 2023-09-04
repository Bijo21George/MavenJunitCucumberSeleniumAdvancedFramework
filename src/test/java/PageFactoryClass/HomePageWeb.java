package PageFactoryClass;

import Utilities.CommonFunctions;
import Utilities.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWeb {

    public HomePageWeb(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='m-text' and contains(text(),'Loans')]")
    WebElement loans;

    @FindBy(xpath = "//span[contains(@class,'icon') and contains(@class, 'personal-loans-icon')]")
    WebElement personalLoans;


    public void launchHomePage() {
        WebDriverManager.getWebDriver().get("https://www.icicibank.com/");
        WebDriverManager.getWebDriver().manage().window().maximize();
    }

    public void hoverOnLoans() {
        Actions actions = new Actions(WebDriverManager.getWebDriver());
        actions.moveToElement(loans).perform();
    }

    public void clickOnPersonalLoan() {
        CommonFunctions.explicitWait(personalLoans);
        personalLoans.click();
    }


}

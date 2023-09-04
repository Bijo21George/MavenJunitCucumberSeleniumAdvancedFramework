package PageFactoryClass;

import Utilities.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class PersonalLoanWeb {

    public PersonalLoanWeb(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loan-amt-personal-input")
    WebElement loanAmount;

    @FindBy(id = "tenure-months-personal-input")
    WebElement tenure;

    @FindBy(id = "interest-rate-personal-input")
    WebElement interestRate;


    @FindBy(xpath = "//a[@class='ic-btn' and contains(text(),'APPLY NOW')]")
    WebElement applyNow;


    public void enterLoanAmount() {
        loanAmount.clear();
        loanAmount.sendKeys("200000");
    }

    public void enterTenure() {
        tenure.clear();
        tenure.sendKeys("36");
    }

    public void enterInterestRate() {
        interestRate.clear();
        interestRate.sendKeys("11");
    }

    public void clickOnApplyNow() {
        applyNow.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    String parentWindowHandle;
    Set<String> allWindowHandles;
    public void switchWindow() {
        parentWindowHandle= WebDriverManager.getWebDriver().getWindowHandle();
        allWindowHandles = WebDriverManager.getWebDriver().getWindowHandles();
        System.out.println("parent"+parentWindowHandle);
        for(String i:allWindowHandles)

        {
            if (!i.contentEquals(parentWindowHandle)) {
                WebDriverManager.getWebDriver().switchTo().window(i);
                System.out.println("next window"+i);
            }
        }
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToElem;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement clickAlert1;

    public void goToAlert(){
        element.moveToElement(SwitchToElem); //se muta pe element si face perform !! obligatoriu  .perform
        element.clickElement(clickAlert1);
        pageMethods.navigateToPage("https://demo.automationtesting.in/Alerts.html");
    }
}

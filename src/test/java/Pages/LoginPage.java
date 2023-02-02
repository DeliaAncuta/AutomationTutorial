package Pages;

import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(css="input[placeholder='E mail']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement parola;

    @FindBy(id="enterbtn")
    private WebElement Enter;

    @FindBy(id="errormsg")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public void LoginInvalid(LoginObject loginObject){

        element.fillElement(email , loginObject.getEmail());

        element.fillElement(parola, loginObject.getPassword());

        element.clickElement(Enter);
        element.validateElementText(error, loginObject.getMessage());

    }
}

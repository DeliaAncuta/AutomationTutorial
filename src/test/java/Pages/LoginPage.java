package Pages;

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

    public void LoginInvalid(String emailValue, String parolaValue, String expectedError){

        element.fillElement(email , emailValue);

        element.fillElement(parola, parolaValue);

        element.clickElement(Enter);
        element.validateElementText(error, expectedError);

    }
}

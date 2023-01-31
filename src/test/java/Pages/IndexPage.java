package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{



    // elemente specifice de aceasta pagina
    @FindBy(id="btn1")
    private WebElement SignIn;

    @FindBy(id="btn2")
    private WebElement SkipRegister;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    // Actiuni sepcifice pt IndexPage

    public LoginPage clickSignin(){
        element.clickElement(SignIn);
        return new LoginPage(driver);
    }

    public RegisterPage clickSkipSignIn(){
        element.clickElement(SkipRegister);
        return new RegisterPage(driver);
    }
}

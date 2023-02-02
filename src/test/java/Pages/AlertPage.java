package Pages;

import Objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav-stacked>li>a")
    private List<WebElement> alertOptions;

    @FindBy(css="#OKTab>button")
    private WebElement btn1;

    @FindBy(css="#CancelTab>button")
    private WebElement btn2;

    @FindBy(css="#Textbox>button")
    private WebElement btn3;

    public void interactAlerctAccept(){
        element.clickElement(alertOptions.get(0));//facem click pe primul element
        element.clickElement(btn1);
        alertsMethods.acceptAlert();
    }

    public void interactAlertDismiss(){
        element.clickElement(alertOptions.get(1));
        element.clickElement(btn2);
        alertsMethods.dismissAlert();
    }

    public void interactAlertValue(AlertObject alertObject){
        element.clickElement(alertOptions.get(2));
        element.clickElement(btn3);
        alertsMethods.fillAlert(alertObject.getAlertText(), Boolean.TRUE);
    }

}

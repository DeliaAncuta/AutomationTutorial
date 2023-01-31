package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {


    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav-stacked>li>a")
    private List<WebElement> windowsOptions;

    @FindBy(css="a>button")
    private WebElement btn1;

    @FindBy(css="#Seperate>button")
    private WebElement btn2;

    @FindBy(css="#Multiple>button")
    private WebElement btn3;

    public void tabProcess(){
        element.clickElement(windowsOptions.get(0));
        element.clickElement(btn1);

        windowMethods.moveSpecificTabW(1);
        windowMethods.closeCurentTabW(); //inchidem Tab-ul cu id ul 1/curent
        windowMethods.moveSpecificTabW(0);
    }
    public void WindowProcess(){
        windowsOptions.get(1).click();
        element.clickElement(btn2);
        windowMethods.moveSpecificTabW(1);
        windowMethods.closeCurentTabW();
        windowMethods.moveSpecificTabW(0);

    }

    public void MultipleTabesProcess(){
        windowsOptions.get(2).click();
        element.clickElement(btn3);

        windowMethods.moveSpecificTabW(2);
        windowMethods.closeCurentTabW();
        windowMethods.moveSpecificTabW(1);
        windowMethods.closeCurentTabW();
        windowMethods.moveSpecificTabW(0);
    }


}

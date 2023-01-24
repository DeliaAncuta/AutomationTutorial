package Tests;

import HelpMethods.AlertsMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import ShareData.shareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AlertTest extends shareData {


    @Test
    public void metodaTest(){

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods pageElement = new PageMethods(getDriver());
        AlertsMethods alertElement = new AlertsMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        element.clickElement(SkipRegister);

        WebElement SwitchToElem = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));
        // Mergem cu mouse ul pe un anumit element !!! = cand dai cu mouse ul peste
        element.moveToElement(SwitchToElem); //se muta pe element si face perform !! obligatoriu  .perform

        WebElement clickAlert1 = getDriver().findElement(By.xpath("//a[text()='Alerts']"));
        element.clickElement(clickAlert1);

        //navigam catre un URL - metoda navigate nu asteapta sa se incarce o pagina
        pageElement.navigateToPage("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a")); //aici css ul e cu . pt ca asa gasim clase

        element.clickElement(alertOptions.get(0));//facem click pe primul element
        WebElement btn1 = getDriver().findElement(By.cssSelector("#OKTab>button")); // aici css ul e cu # pt ca asa gasim ID uri
        element.clickElement(btn1);

        //Interactionam cu o alerta din browser
        alertElement.acceptAlert();

        element.clickElement(alertOptions.get(1));
        WebElement btn2 = getDriver().findElement(By.cssSelector("#CancelTab>button"));
        element.clickElement(btn2);

        alertElement.dismissAlert();

        element.clickElement(alertOptions.get(2));
        WebElement btn3 = getDriver().findElement(By.cssSelector("#Textbox>button"));
        element.clickElement(btn3);

        alertElement.fillAlert("Ceva", Boolean.TRUE);

    }
}

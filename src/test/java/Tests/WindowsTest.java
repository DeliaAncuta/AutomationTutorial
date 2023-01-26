package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.WindowMethods;
import ShareData.shareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WindowsTest extends shareData {

    @Test
    public void metodaTest(){

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods pelement = new PageMethods(getDriver());
        WindowMethods welement = new WindowMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        element.clickElement(SkipRegister);

        WebElement SwitchToElem = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

        element.moveToElement(SwitchToElem);

        WebElement clickWindows = getDriver().findElement(By.xpath("//a[text() = 'Windows']"));
        element.clickElement(clickWindows);

        pelement.navigateToPage("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));

        element.clickElement(windowsOptions.get(0));
        WebElement btn1 = getDriver().findElement(By.cssSelector("a>button"));
        element.clickElement(btn1);

        //identificam multimea de taburi/windows
        //ne mutam cu focusul pe un tab specific
        welement.moveSpecificTabW(1);
        welement.closeCurentTabW(); //inchidem Tab-ul cu id ul 1/curent
        welement.moveSpecificTabW(0);

        windowsOptions.get(1).click();
        WebElement btn2 = getDriver().findElement(By.cssSelector("#Seperate>button"));
        element.clickElement(btn2);

        List<String> browserWindows = new ArrayList<String>(getDriver().getWindowHandles());
        welement.moveSpecificTabW(1);
        welement.closeCurentTabW();
        welement.moveSpecificTabW(0);

        windowsOptions.get(2).click();
        WebElement btn3 = getDriver().findElement(By.cssSelector("#Multiple>button"));
        element.clickElement(btn3);

        welement.moveSpecificTabW(2);
        welement.closeCurentTabW();
        welement.moveSpecificTabW(1);
        welement.closeCurentTabW();
        welement.moveSpecificTabW(0);

    }

}

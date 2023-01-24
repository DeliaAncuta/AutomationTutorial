package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import ShareData.shareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FrameTest extends shareData {

    @Test
    public void metodaTest(){

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods pElement = new PageMethods(getDriver());
        FrameMethods fElement = new FrameMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        element.clickElement(SkipRegister);

        //Wait explicit cu conditii diferite


        WebElement SwitchToElem = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

        // Mergem cu mouse ul pe un anumit element !!! = Actiuni cand dai cu mouse ul peste
        element.moveToElement(SwitchToElem);

        WebElement clickFrames = getDriver().findElement(By.xpath("//a[text() = 'Frames']"));
        element.clickElement(clickFrames);

        //navigam catre un URL - metoda navigate nu asteapta sa se incarce o pagina
        pElement.navigateToPage("https://demo.automationtesting.in/Frames.html");


        List<WebElement> FrameOptions = getDriver().findElements(By.cssSelector(".nav-tabs>li>a"));
        element.clickElement(FrameOptions.get(0));

        //Ne mutam pe un iframe = iframe este un body mai mid dintr un body

        //getDriver().switchTo().frame("singleframe"); //Linia aceasta ne a bagat in acest frame/ in dreptunghi
        fElement.switchFrame("singleframe");
        WebElement input1 = getDriver().findElement(By.cssSelector("input[type='text']"));
        element.fillElement(input1, "\"Am ajuns aici" );
       //input1.sendKeys("Am ajuns aici"); //din toate interactiunile frames dureaza cel mai mult
        fElement.switchDefault(); //te scoate din orice frame este si te aduce pe body ul principal

        element.clickElement(FrameOptions.get(1));

        //Ne mutam pe un alt frame

        fElement.switchFrame(getDriver().findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        fElement.switchFrame(getDriver().findElement(By.cssSelector("iframe[src='SingleFrame.html']")));

        WebElement input2 = getDriver().findElement(By.cssSelector("input[type='text']"));
        element.fillElement(input2, "Acum am ajuns aici");
        fElement.switchDefault();

    }

}

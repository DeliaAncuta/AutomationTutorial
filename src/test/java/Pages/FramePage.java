package Pages;

import Objects.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav-tabs>li>a")
    private List<WebElement> FrameOptions;

    @FindBy(css="input[type='text']")
    private WebElement input1;

    @FindBy(css="input[type='text']")
    private WebElement input2;

    public void firstFrame(FrameObject frameObject){
        element.clickElement(FrameOptions.get(0));

        frameMethods.switchFrame("singleframe");

        element.fillElement(input1, frameObject.getFirstFrame() );

        frameMethods.switchDefault();
    }

    public void secondFrame(FrameObject frameObject){
        element.clickElement(FrameOptions.get(1));

        frameMethods.switchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.switchFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));

        element.fillElement(input1, frameObject.getSecondFrame());

        element.fillElement(input2, "Acum am ajuns aici");
        frameMethods.switchDefault();
    }

}

package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest extends ShareData {

    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFrame();

        FramePage framePage = new FramePage(getDriver());
        framePage.firstFrame("Am ajuns aici");
        framePage.secondFrame("si acum aici");
    }

}

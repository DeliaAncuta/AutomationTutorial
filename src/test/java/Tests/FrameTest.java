package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;

import ShareData.Hooks;
import org.testng.annotations.Test;



public class FrameTest extends Hooks {

    @Test
    public void metodaTest(){

        FrameObject frameObject = new FrameObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        testReport.attacheReport("pass", "Click  SkipSignIn button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFrame();
        testReport.attacheReport("pass", "Go to frame");

        FramePage framePage = new FramePage(getDriver());
        framePage.firstFrame(frameObject);
        framePage.secondFrame(frameObject);
        testReport.attacheReport("pass", "Manage multiple frames");
    }

}

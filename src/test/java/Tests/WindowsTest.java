package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;

import ShareData.Hooks;
import org.testng.annotations.Test;

public class WindowsTest extends Hooks {

    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        testReport.attacheReport("pass", "Click  SkipSignIn button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindows();
        testReport.attacheReport("pass", "Go to Windoes tab");

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.tabProcess();
        windowPage.WindowProcess();
        windowPage.MultipleTabesProcess();
        testReport.attacheReport("pass", "Manage tabs and windows");

    }

}

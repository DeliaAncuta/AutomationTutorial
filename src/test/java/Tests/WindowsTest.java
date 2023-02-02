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

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindows();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.tabProcess();
        windowPage.WindowProcess();
        windowPage.MultipleTabesProcess();

    }

}

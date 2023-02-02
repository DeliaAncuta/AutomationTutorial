package Tests;

import Objects.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;

import ShareData.Hooks;
import org.testng.annotations.Test;


public class LoginTest extends Hooks {


    @Test
    public void metodaTest(){

        LoginObject loginObject = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid(loginObject);

    }



}

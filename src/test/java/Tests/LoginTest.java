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
        testReport.attacheReport("pass", "i click on sign button");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid(loginObject);
        testReport.attacheReport("pass", "i manage to validate invalid login");

    }



}

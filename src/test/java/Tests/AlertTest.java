package Tests;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import ShareData.ShareData;

import org.testng.annotations.Test;


public class AlertTest extends ShareData {


    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlerctAccept();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue("ceva");

    }
}

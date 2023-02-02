package Tests;

import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;


import ShareData.Hooks;
import org.testng.annotations.Test;


public class AlertTest extends Hooks {


    @Test
    public void metodaTest(){

        AlertObject alertObject = new AlertObject(testData);


        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlerctAccept();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue(alertObject);

    }
}

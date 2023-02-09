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
        testReport.attacheReport("pass", "Click  SkipSignIn button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();
        testReport.attacheReport("pass", "Go to Alert");

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlerctAccept();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue(alertObject);
        testReport.attacheReport("pass", "Manage to close multiple alerts type");

    }
}

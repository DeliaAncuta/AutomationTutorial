package Tests;

import HelpMethods.AlertsMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import ShareData.shareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AlertTest extends shareData {


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

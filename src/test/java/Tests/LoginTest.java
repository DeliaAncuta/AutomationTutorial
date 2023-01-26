package Tests;

import HelpMethods.ElementMethods;
import Pages.IndexPage;
import Pages.LoginPage;
import ShareData.shareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends shareData {


    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid("delia@gmail.com", "Parola","Invalid User Name or PassWord");

    }



}

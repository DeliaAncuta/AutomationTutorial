package Tests;

import Pages.IndexPage;
import Pages.LoginPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {


    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid("delia@gmail.com", "Parola","Invalid User Name or PassWord");

    }



}

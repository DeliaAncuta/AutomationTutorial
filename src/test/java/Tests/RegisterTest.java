package Tests;

import HelpMethods.ElementMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void metodaTest(){


        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.insertRegisterData("Delia", "Ancuta", "AdresaTest", "email", "0876545");
        registerPage.Gen();
        registerPage.SkillsInfo("Java");
        registerPage.selectCountry("Australia");
        registerPage.birthInfo("1997", "March", "6");
        registerPage.passWord("parolaTest", "parolaTest");
    }

}

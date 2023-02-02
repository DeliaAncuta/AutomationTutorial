package Tests;


import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;

import ShareData.Hooks;
import org.testng.annotations.Test;


public class RegisterTest extends Hooks {

    @Test
    public void metodaTest(){

        RegisterObject registerObject = new RegisterObject(testData);


        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerProcess(registerObject);
    }

}

package Tests;

import HelpMethods.ElementMethods;
import ShareData.shareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends shareData {


    @Test
    public void metodaTest(){

        //Declaram un obiect si refractorizam actiunile - eliminam actiuni dublicate
        // refractorizam - gindim la modul general

        ElementMethods element = new ElementMethods(getDriver()); //am facut un obiect cu constuctorul din ElementsMethonds

        //Declaram elementul sign in;
        WebElement SignIn = getDriver().findElement(By.id("btn1"));
        element.clickElement(SignIn); //aceasta metoda are si wait ul

        WebElement email = getDriver().findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "delia@gmail.com";
        element.fillElement(email , emailValue); //aceasta metoda are si wait ul

        WebElement parola = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "Parola";
        element.fillElement(parola, parolaValue); //aceasta metoda are si wait ul inclus

        WebElement Enter = getDriver().findElement(By.id("enterbtn"));
        element.clickElement(Enter);

        //Validam un mesaj de eroare
        WebElement error = getDriver().findElement(By.id("errormsg"));
        String expectedError = "Invalid User Name or PassWord";
        element.validateElementText(error, expectedError); //aceasta metoda are si wait ul inclus

    }



}

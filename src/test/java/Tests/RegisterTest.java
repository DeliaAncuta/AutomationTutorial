package Tests;

import HelpMethods.ElementMethods;
import ShareData.shareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest extends shareData {

    @Test
    public void metodaTest(){

        ElementMethods element = new ElementMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        element.clickElement(SkipRegister);

        WebElement FirstName = getDriver().findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Delia";
        element.fillElement(FirstName, firstNameValue);

        WebElement LastName = getDriver().findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastNameValue = "Ancuta";
        element.fillElement(LastName, lastNameValue);

        WebElement Adress = getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String adressValue = "Strada ";
        element.fillElement(Adress, adressValue);

        WebElement Email = getDriver().findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        String emailValue = "delia@gmail.com ";
        element.fillElement(Email, emailValue);

        WebElement Telefon = getDriver().findElement(By.xpath("//input[@ng-model='Phone']"));
        String telefonValue = "434343434";
        element.fillElement(Telefon, telefonValue);

        WebElement Gen = getDriver().findElement(By.xpath("//input[@value='FeMale']"));
        element.clickElement(Gen);

        WebElement Hobby = getDriver().findElement(By.id("checkbox2"));
        element.clickElement(Hobby);

        // Bucata de cod care face scroll pe baza de pixeli -
        element.scrollByPixel(0, 300);

        element.clickElement(Gen);

        WebElement Language = getDriver().findElement(By.id("msdd"));
        element.clickElement(Language);

        // Interactionam cu o multime de elemente .Lista de Language care e element div

        List<WebElement> LanguageOptions = getDriver().findElements(By.cssSelector(".ui-autocomplete>li>a"));
        String ExpectedLanguage = "English";

        for(Integer i = 0; i<LanguageOptions.size(); i++){
            if(LanguageOptions.get(i).getText().equals(ExpectedLanguage)){ //chemam elementul, ii citim valoarea cu getText si verificam ca textul de pe element sa fie cu
                // variabila noastra
                element.clickElement(LanguageOptions.get(i)); // pe elementul curent facem click
            }
        }

        element.clickElement(Gen);

        //Interactionam cu un drop down clasic. > select
        WebElement Skills = getDriver().findElement(By.id("Skills"));
        element.SelectElementValue(Skills,"Java");

        element.scrollByPixel(0, 300);

        /*WebElement SelectCountry = driver.findElement(By.cssSelector(".select2-selection"));
        element.clickElement(SelectCountry);

        WebElement SelectCountryElem = driver.findElement(By.className(".select2-selection"));
        SelectCountryElem.sendKeys("Autralia");
        SelectCountryElem.sendKeys(Keys.ENTER); //Il punem sa apese pe un Enter
        */

        WebElement Year = getDriver().findElement(By.id("yearbox"));
        element.SelectElementValue(Year, "1997");

        WebElement Month = getDriver().findElement(By.xpath("//select[@ng-model='monthbox']"));
        element.SelectElementValue(Month, "March");

        WebElement Day = getDriver().findElement(By.id("daybox"));
        element.SelectElementValue(Day, "6");

        WebElement Password = getDriver().findElement(By.id("firstpassword"));
        String PasswordValue = "Parola ";
        element.fillElement(Password, PasswordValue);

        WebElement ConfirmPass = getDriver().findElement(By.id("secondpassword"));
        String ConfirmPassValue = "Parola  ";
        element.fillElement(ConfirmPass, ConfirmPassValue);
    }

}

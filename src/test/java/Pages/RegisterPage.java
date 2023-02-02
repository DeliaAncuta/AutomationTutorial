package Pages;

import Objects.RegisterObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage{


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToElem;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement clickAlert1;

    @FindBy(xpath = "//a[text() = 'Frames']")
    private WebElement clickFrames;

    @FindBy(xpath = "//a[text() = 'Windows']")
    private WebElement clickWindows;

    @FindBy(css="input[placeholder='First Name']")
    private WebElement FirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement LastName;

    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    private WebElement Adress;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement Email;

    @FindBy(xpath = "//input[@ng-model='Phone']")
    private WebElement Telefon;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement Gen;

    @FindBy(id="checkbox2")
    private WebElement Hobby;

    @FindBy(id="msdd")
    private WebElement Language;

    @FindBy(css=".ui-autocomplete>li>a")
    private List<WebElement> LanguageOptions;

    @FindBy(id="Skills")
    private WebElement Skills;

    @FindBy(css=".select2-selection")
    private WebElement SelectCountry;

    @FindBy(css=".select2-search__field")
    private WebElement SelectCountryElem;

    @FindBy(id="yearbox")
    private WebElement Year;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement Month;

    @FindBy(id="daybox")
    private WebElement Day;

    @FindBy(id="firstpassword")
    private WebElement Password;

    @FindBy(id="secondpassword")
    private WebElement ConfirmPass;

    @FindBy(id="submitbtn")
    private WebElement submitBtn;

    //sau o singura metoda cu foarte multi parametrii --> vezi curs

    public void goToAlert(){
        element.moveToElement(SwitchToElem);
        element.clickElement(clickAlert1);
        pageMethods.navigateToPage("https://demo.automationtesting.in/Alerts.html");
    }

    public void goToFrame(){
        element.moveToElement(SwitchToElem);
        element.clickElement(clickFrames);
        pageMethods.navigateToPage("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindows(){
        element.moveToElement(SwitchToElem);
        element.clickElement(clickWindows);
        pageMethods.navigateToPage("https://demo.automationtesting.in/Windows.html");
    }

    public void registerProcess(RegisterObject registerObject){
        insertRegisterData(registerObject.getFirstName(), registerObject.getLastName(), registerObject.getAdress(), registerObject.getEmail(), registerObject.getTelefon());
        Gen();
        SkillsInfo(registerObject.getLanguage(), registerObject.getpLanguage());
        selectCountry(registerObject.getCountry());
        birthInfo(registerObject.getYear(), registerObject.getMonth(), registerObject.getDay());
        passWord(registerObject.getPassword(), registerObject.getConfirmPassword());
    }

    public void insertRegisterData(String firstNameValue,String lastNameValue, String adressValue, String emailValue, String telefonValue ){
        element.fillElement(FirstName, firstNameValue);
        element.fillElement(LastName, lastNameValue);
        element.fillElement(Adress, adressValue);
        element.fillElement(Email, emailValue);
        element.fillElement(Telefon, telefonValue);
    }

    public void Gen(){
        element.clickElement(Gen);
    }


    public void SkillsInfo(String language, String pLanguage){
        element.clickElement(Hobby);
        element.scrollByPixel(0, 300);
        element.clickElement(Language);

        // Interactionam cu o multime de elemente .Lista de Language care e element div
        String ExpectedLanguage = language;

        for(Integer i = 0; i<LanguageOptions.size(); i++){
            if(LanguageOptions.get(i).getText().equals(ExpectedLanguage)){ //chemam elementul, ii citim valoarea cu getText si verificam ca textul de pe element sa fie cu
                // variabila noastra
                element.clickElement(LanguageOptions.get(i)); // pe elementul curent facem click
            }
        }
        element.SelectElementValue(Skills,pLanguage);

    }

    public void selectCountry(String countryValue){
        element.clickElement(SelectCountry);
        element.fillElement(SelectCountryElem, countryValue);
        SelectCountryElem.sendKeys(Keys.ENTER);

    }

    public void birthInfo(String year, String month, String day) {
        element.SelectElementValue(Year, year);
        element.SelectElementValue(Month, month);
        element.SelectElementValue(Day, day);


    }
    public void passWord(String PasswordValue, String ConfirmPassValue){
        element.fillElement(Password, PasswordValue);
        element.fillElement(ConfirmPass, ConfirmPassValue);

    }
}

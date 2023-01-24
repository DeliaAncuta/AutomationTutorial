package Tests;

import HelpMethods.PageMethods;
import ShareData.shareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.naming.ldap.Control;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class WindowsTests extends shareData {

        @Test
        public void metodaTest(){

            PageMethods pageElement = new PageMethods(getDriver());

            WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
            SkipRegister.click();

            WebElement SwitchToElem = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

            // Mergem cu mouse ul pe un anumit element !!! = Actiuni cand dai cu mouse ul peste
            Actions actionOnWindows = new Actions(getDriver());
            actionOnWindows.moveToElement(SwitchToElem).perform(); //se muta pe element si face perform !! obligatoriu  .perform

            WebElement clickWindows = getDriver().findElement(By.xpath("//a[text() = 'Windows']"));
            clickWindows.click();

            //navigam catre un URL - metoda navigate nu asteapta sa se incarce o pagina
            pageElement.navigateToPage("https://demo.automationtesting.in/Windows.html");

            //De aici in jos incepem sa accesam elementele dintr-o lista de Web elements
            //Definim lista de elemente si ii indicam primul element de unde sa inceapa numerotarea
            List<WebElement> windowsOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));

            //Dam click pe primul element din lista
            windowsOptions.get(0).click();

            //Dam click pe butonul afisat in partea din dreapta -->
            WebElement btn1 = getDriver().findElement(By.cssSelector("a>button"));
            btn1.click();


            //driver.navigate().to("https://www.selenium.dev/"); de aici mi am dat seama ca el ramane inca pe primul tab;

            //Definim o lista de taburi si ii spunem sa navighe catre al doilea tab
            // .getWindowHandle() - get currect window handle
            // .getWindowHandles() - get all window handles

            List<String> browserTabs = new ArrayList<String> (getDriver().getWindowHandles());
            getDriver().switchTo().window(browserTabs .get(1));

            //Am introdus bucata asta de cod ca sa stiu ca face ceva pe pagina cu selenium si nu se inchide direct
            WebElement about = getDriver().findElement(By.cssSelector(".nav-link"));
            about.click();
            WebElement aboutSelenium  = getDriver().findElement(By.xpath("//a[text() = 'About Selenium']"));
            aboutSelenium.click();

            getDriver().close(); //inchidem Tab-ul cu id ul 1
            getDriver().switchTo().window(browserTabs.get(0));

            windowsOptions.get(1).click();
            WebElement btn2 = getDriver().findElement(By.cssSelector("#Seperate>button"));
            btn2.click();


            //Definesc pointer ul actual
            String parentWindow =getDriver().getWindowHandle();
            //Cauta toate point-urile pe care le pune intr-un set si il convertesc intr o lista
            Set<String> allWindows =getDriver().getWindowHandles(); //
            List<String> windows = new ArrayList<>(allWindows);

            //un for each si daca pointer ul actual nu este cel parinte inchide ferestra
            // ??? de intrebat daca merge si pt mai multe ferestre sau intra in bucla infinita
            for (String curentWindow: windows) {
                if (!parentWindow.equals(curentWindow)){
                    getDriver().switchTo().window(curentWindow);
                    getDriver().manage().window().maximize();

                    //Am introdus bucata asta de cod ca sa stiu ca face ceva pe pagina cu selenium si nu se inchide direct
                    WebElement about1 = getDriver().findElement(By.cssSelector(".nav-link"));
                    about1.click();
                    WebElement aboutSelenium1  = getDriver().findElement(By.xpath("//a[text() = 'About Selenium']"));
                    aboutSelenium1.click();

                    getDriver().close();
                    getDriver().switchTo().window(parentWindow);
                }
            }

            windowsOptions.get(2).click();
            WebElement btn3 = getDriver().findElement(By.cssSelector("#Multiple>button"));
            btn3.click();

            List<String> multipleTabs = new ArrayList<String> (getDriver().getWindowHandles());
            getDriver().switchTo().window(multipleTabs.get(2));
            getDriver().close();
            getDriver().switchTo().window(multipleTabs.get(1));
            getDriver().close();
            getDriver().switchTo().window(multipleTabs.get(0));
        }
}

package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WindowsTestCurs {

    public WebDriver driver;

    @Test
    public void metodaTest(){

        //Deschidem un browser de chrome
        driver = new ChromeDriver();

        //Facem driver ul mare
        driver.manage().window().maximize();

        //Accesam un URl specific - metoda get asteapta ca pagina sa se incarce
        driver.get("https://demo.automationtesting.in/Index.html");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement SkipRegister = driver.findElement(By.id("btn2"));
        SkipRegister.click();

        WebElement SwitchToElem = driver.findElement(By.xpath("//a[text()='SwitchTo']"));

        // Mergem cu mouse ul pe un anumit element !!! = Actiuni cand dai cu mouse ul peste
        Actions actionOnWindows = new Actions(driver);
        actionOnWindows.moveToElement(SwitchToElem).perform(); //se muta pe element si face perform !! obligatoriu  .perform

        WebElement clickWindows = driver.findElement(By.xpath("//a[text() = 'Windows']"));
        clickWindows.click();

        driver.navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));

        windowsOptions.get(0).click();
        WebElement btn1 = driver.findElement(By.cssSelector("a>button"));
        btn1.click();

        //identificam multimea de taburi/windows
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        //ne mutam cu focusul pe un tab specific
        driver.switchTo().window(browserTabs .get(1));
        driver.close(); //inchidem Tab-ul cu id ul 1/curent
        driver.switchTo().window(browserTabs.get(0));

        windowsOptions.get(1).click();
        WebElement btn2 = driver.findElement(By.cssSelector("#Seperate>button"));
        btn2.click();

        List<String> browserWindows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserWindows.get(1));
        driver.close();
        driver.switchTo().window(browserWindows.get(0));

        windowsOptions.get(2).click();
        WebElement btn3 = driver.findElement(By.cssSelector("#Multiple>button"));
        btn3.click();

        List<String> multipleTabs = new ArrayList<String> (driver.getWindowHandles());

        driver.switchTo().window(multipleTabs.get(2));
        driver.close();
        driver.switchTo().window(multipleTabs.get(1));
        driver.close();
        driver.switchTo().window(multipleTabs.get(0));


    }

}

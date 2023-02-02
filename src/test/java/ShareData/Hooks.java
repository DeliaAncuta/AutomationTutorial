package ShareData;

import InputFile.PropertiesUtilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData{

    public HashMap <String, String> testData;
    private String testName;


    @BeforeMethod
    public void prepareEnviroment(){
        setupChrome();
        testName=this.getClass().getSimpleName(); //returneaza numele clasei care ruleaza
        PropertiesUtilities propertiesUtilities = new PropertiesUtilities(testName);
        testData=propertiesUtilities.GetAllData();



    }

    @AfterMethod
    public void clearEnviroment(){
        clearBrowser();
    }

}

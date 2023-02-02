package InputFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesUtilities {
    public FileInputStream fileInputStream; //reprezinta tipul de variabila ce imi permite sa citesc un fisier
    public Properties properties; //clasa care imi da voie sa manipulez fisier de tip properties

    public PropertiesUtilities(String name) {
        loadFile(name);
    }

    public void loadFile(String nameTest) {
        properties = new Properties(); //il initializam
        try {

            fileInputStream = new FileInputStream("src/test/resources/TestData/"+  nameTest +"Data.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } //ii cu exceptie

    public HashMap<String, String> GetAllData() {
        HashMap<String, String> testData = new HashMap<>();
        for(String key: properties.stringPropertyNames()){
            testData.put(key, properties.getProperty(key));
        }
        return testData;
    }
}





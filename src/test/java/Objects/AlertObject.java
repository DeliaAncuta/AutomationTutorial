package Objects;

import java.util.HashMap;

public class AlertObject {

    private String alertText;

    public AlertObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    public String getAlertText() {
        return alertText;
    }

    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    private void populateObject(HashMap<String, String> testData){
        for(String key:testData.keySet()){ //returneaza lista de chei
            switch (key) {
                case "alertText":
                    setAlertText(testData.get(key));
                    break;
            }
        }
    }
}

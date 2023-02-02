package Objects;

import java.util.HashMap;

public class FrameObject {

    private String firstFrame;
    private String secondFrame;

    public FrameObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    public String getFirstFrame() {
        return firstFrame;
    }

    public void setFirstFrame(String firstFrame) {
        this.firstFrame = firstFrame;
    }

    public String getSecondFrame() {
        return secondFrame;
    }

    public void setSecondFrame(String secondFrame) {
        this.secondFrame = secondFrame;
    }

    private void populateObject(HashMap<String, String> testData){
        for(String key:testData.keySet()){ //returneaza lista de chei
            switch (key) {
                case "firstFrame":
                    setFirstFrame(testData.get(key));
                    break;
                case "secondFrame":
                    setSecondFrame(testData.get(key));
                    break;
            }
        }
    }
}

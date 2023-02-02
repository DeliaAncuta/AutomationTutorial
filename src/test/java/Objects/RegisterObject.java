package Objects;

import java.util.HashMap;

public class RegisterObject {

    private String firstName;
    private String lastName;
    private String adress;
    private String email;
    private String telefon;
    private String language;
    private String pLanguage;
    private String country;
    private String year;
    private String month;
    private String day;
    private String password;
    private String confirmPassword;

    public RegisterObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getpLanguage() {
        return pLanguage;
    }

    public void setpLanguage(String pLanguage) {
        this.pLanguage = pLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    private void populateObject(HashMap<String, String> testData){
        for(String key:testData.keySet()){ //returneaza lista de chei
            switch (key) {
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "adress":
                    setAdress(testData.get(key));
                    break;
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "telefon":
                    setTelefon(testData.get(key));
                    break;
                case "language":
                    setLanguage(testData.get(key));
                    break;
                case "pLanguage":
                    setpLanguage(testData.get(key));
                    break;
                case "country":
                    setCountry(testData.get(key));
                    break;
                case "year":
                    setYear(testData.get(key));
                    break;
                case "month":
                    setMonth(testData.get(key));
                    break;
                case "day":
                    setDay(testData.get(key));
                    break;
                case "password":
                    setPassword(testData.get(key));
                    break;
                case "confirmPassword":
                    setConfirmPassword(testData.get(key));
                    break;
            }
        }
    }
}

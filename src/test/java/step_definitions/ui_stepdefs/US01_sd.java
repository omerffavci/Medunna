package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.RegisterPage_omer;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US01_sd {
    RegisterPage_omer registerPage_omer = new RegisterPage_omer();
    @Given("Kullanici {string} ye giderr")
    public void kullaniciYeGiderr(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @Given("Kullanici account menüsüne tiklarr")
    public void kullaniciAccountMenüsüneTiklarr() {
        registerPage_omer.accountmenu_o.click();
    }

    @Then("Kullanici register butonuna tiklarr")
    public void kullaniciRegisterButonunaTiklarr() {
        registerPage_omer.registermenu_o.click();

    }

    @Then("Kullanici bütün bilgileri eksiksiz doldururr")
    public void kullaniciBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.firstname_o.sendKeys("Sacha");
        registerPage_omer.lastname_o.sendKeys("Boey");
        registerPage_omer.username_o.sendKeys("Saboey");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);


    }


    @And("{string} yazisini görürr")
    public void yazisiniGörürr(String arg0) {
       ReusableMethods.visibleWait(registerPage_omer.regSavedAlert_o,3);
        assertEquals(arg0,registerPage_omer.regSavedAlert_o.getText());
    }

    @Then("Kullanici SSN disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciSSNDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.firstname_o.sendKeys("Ashley");
        registerPage_omer.lastname_o.sendKeys("Lan");
        registerPage_omer.username_o.sendKeys("AshLan");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);
    }

    @Given("Kullanici SSN olarak {string} girerr")
    public void kullaniciSSNOlarakGirerr(String ssn) {
        registerPage_omer.ssn_o.sendKeys(ssn);
    }

    @And("Kullanici {string} yazisini görürr")
    public void kullaniciYazisiniGörürr(String arg0) {
        ReusableMethods.visibleWait(registerPage_omer.invalidSSN_o,2);
        assertEquals(arg0, registerPage_omer.invalidSSN_o.getText());
    }

    @And("Kullanici {string} yazisini görürrr")
    public void kullaniciYazisiniGörürrr(String arg0) {
        ReusableMethods.visibleWait(registerPage_omer.requiredSSN_o,2);
        assertEquals(arg0, registerPage_omer.requiredSSN_o.getText());
    }

    @Then("Kullanici Firstname disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciFirstnameDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.lastname_o.sendKeys("Lan");
        registerPage_omer.username_o.sendKeys("AshLan");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici Your FirstName is required. yazisini görürr")
    public void kullaniciYourFirstNameIsRequiredYazisiniGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.requiredFN_o,2);
        assertEquals("Your FirstName is required.",registerPage_omer.requiredFN_o.getText());
    }

    @Then("Kullanici LastName disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciLastNameDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.firstname_o.sendKeys("Ashley");
        registerPage_omer.username_o.sendKeys("AshLan");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici Your LastName is required. yazisini görürr")
    public void kullaniciYourLastNameIsRequiredYazisiniGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.requiredLN_o,2);
        assertEquals("Your LastName is required.",registerPage_omer.requiredLN_o.getText());
    }
}

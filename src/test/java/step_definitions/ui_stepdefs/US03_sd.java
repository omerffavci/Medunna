package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.RegisterPage_omer;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US03_sd {
    RegisterPage_omer registerPage_omer = new RegisterPage_omer();
    @Then("Kullanici pssword disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciPsswordDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.firstname_o.sendKeys("Sacha");
        registerPage_omer.lastname_o.sendKeys("Boey");
        registerPage_omer.username_o.sendKeys("Saboey");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));

    }

    @Given("Kullanici password olarak {string} girerr")
    public void kullaniciPasswordOlarakGirerr(String arg0) {
        registerPage_omer.firstPass_o.sendKeys(arg0, Keys.TAB,arg0,
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici passwordun zayif oldugunu görürr")
    public void kullaniciPasswordunZayifOldugunuGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.redCol_o,2);
    }

    @Given("Kullanici password olarak {string} ifadesini girerr")
    public void kullaniciPasswordOlarakIfadesiniGirerr(String arg0) {
        registerPage_omer.firstPass_o.sendKeys(arg0, Keys.TAB,arg0,
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici passwordun seviyesini zayif olarak görürr")
    public void kullaniciPasswordunSeviyesiniZayifOlarakGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.orangeCol_o,2);

    }

    @Given("Kullanici password olarak {string} ifadesinii girerr")
    public void kullaniciPasswordOlarakIfadesiniiGirerr(String arg0) {
        registerPage_omer.firstPass_o.sendKeys(arg0, Keys.TAB,arg0,
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici passwordun seviyesini güclü olarak görürr")
    public void kullaniciPasswordunSeviyesiniGüclüOlarakGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.greenCol_o,2);
    }

    @Given("Kullanici password olarak {string} ifadesin girerr")
    public void kullaniciPasswordOlarakIfadesinGirerr(String arg0) {
        registerPage_omer.firstPass_o.sendKeys(arg0, Keys.TAB,arg0,
                Keys.TAB,Keys.ENTER);
    }

    @And("Kullanici passwordun seviyesini en güclü olarak görürr")
    public void kullaniciPasswordunSeviyesiniEnGüclüOlarakGörürr() {
        ReusableMethods.visibleWait(registerPage_omer.darkgreenCol_o,2);

    }
}

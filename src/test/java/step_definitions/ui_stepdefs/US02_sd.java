package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.RegisterPage_omer;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US02_sd {

    RegisterPage_omer registerPage_omer = new RegisterPage_omer();

    @Then("Kullanici Username disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciUsernameDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.firstname_o.sendKeys("Sacha");
        registerPage_omer.lastname_o.sendKeys("Boey");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"), Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);
    }


    @And("Kullanici {string} yazisinii görürr")
    public void kullaniciYazisiniiGörürr(String str) {
        ReusableMethods.visibleWait(registerPage_omer.requiredUN_o,2);
        assertEquals(str,registerPage_omer.requiredUN_o.getText());

    }

    @Then("Kullanici Email disinda bütün bilgileri eksiksiz doldururr")
    public void kullaniciEmailDisindaBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys(ConfigReader.getProperty("ssnNumber_of"));
        registerPage_omer.firstname_o.sendKeys("Sacha");
        registerPage_omer.lastname_o.sendKeys("Boey");
        registerPage_omer.username_o.sendKeys("Saboey");
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);
    }

    @Given("Kullanici Email olarak {string} ifadesini girerr")
    public void kullaniciEmailOlarakIfadesiniGirerr(String arg0) {
        registerPage_omer.email_o.sendKeys(arg0);
    }

    @And("Kullanici {string} yazisinii dogrularr")
    public void kullaniciYazisiniiDogrularr(String arg0) {
        ReusableMethods.visibleWait(registerPage_omer.invalidEmail_o,2);
        assertEquals(arg0,registerPage_omer.invalidEmail_o.getText());
    }

    @And("Kullanici Your email is required. yazisinii dogrularr")
    public void kullaniciYourEmailIsRequiredYazisiniiDogrularr() {
        ReusableMethods.visibleWait(registerPage_omer.requiredEmail_o,2);
        assertEquals("Your email is required.",registerPage_omer.requiredEmail_o.getText());
    }
}

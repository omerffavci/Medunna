package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage_omer;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class Us1_sd {
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
        registerPage_omer.firstname_o.sendKeys("Ashley");
        registerPage_omer.lastname_o.sendKeys("Lan");
        registerPage_omer.username_o.sendKeys("AshLan");
        registerPage_omer.email_o.sendKeys(ConfigReader.getProperty("eMail_of"));
        registerPage_omer.firstPass_o.sendKeys(ConfigReader.getProperty("pass_of"),Keys.TAB,ConfigReader.getProperty("pass_of"),
                Keys.TAB,Keys.ENTER);


    }


    @And("{string} yazisini görürr")
    public void yazisiniGörürr(String arg0) {
       ReusableMethods.visibleWait(registerPage_omer.regSavedAlert_o,3);
        assertEquals(arg0,registerPage_omer.regSavedAlert_o.getText());
    }
}

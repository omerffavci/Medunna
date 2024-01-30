package step_definitions.ui_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegisterPage_omer;
import utilities.ConfigReader;
import utilities.Driver;

public class Us1_sd {
    RegisterPage_omer registerPage_omer = new RegisterPage_omer();
    @Given("Kullanici {string} ye giderr")
    public void kullaniciYeGiderr(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("regurl"));
    }

    @Then("Kullanici bütün bilgileri eksiksiz doldururr")
    public void kullaniciBütünBilgileriEksiksizDoldururr() {
        registerPage_omer.ssn_o.sendKeys("456-34-8658");
        registerPage_omer.firstname_o.sendKeys("Omer");

    }


}

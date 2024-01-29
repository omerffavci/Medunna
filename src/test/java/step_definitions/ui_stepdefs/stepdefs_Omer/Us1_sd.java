package step_definitions.ui_stepdefs.stepdefs_Omer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.us_1_2_3.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Us1_sd {
    RegisterPage registerPage = new RegisterPage();
    @Given("Kullanici {string} ye giderr")
    public void kullaniciYeGiderr(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("regurl"));
    }

    @Then("Kullanici bütün bilgileri eksiksiz doldururr")
    public void kullaniciBütünBilgileriEksiksizDoldururr() {
        registerPage.ssn_o.sendKeys("456-34-8658");
        registerPage.firstname_o.sendKeys("Omer");

    }


}

package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPageFth;
import utilities.ConfigReader;
import utilities.Driver;

public class Us05_Stepdefinition {

    MedunnaPageFth us05 = new MedunnaPageFth();
    WebDriver driver = new ChromeDriver();
    Actions act = new Actions(driver);

    @Given("Kullanici  {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

        @Then("Make an Appointment sekmesine tiklar")
        public void makeAnAppointmentSekmesineTiklar() {

           Driver.getDriver().wait(1);
            us05.makeAppointmentButton.click();
            Driver.getDriver().wait(1);

        }

    @And("isim olarak {string} girer")
    public void isimOlarakGirer(String firstName) {
        us05.firstNameBox.sendKeys(firstName);
    }

    @And("soy isim {string} girer")
    public void soyIsimGirer(String lastName) {

        //Driver.getDriver().wait(1);
        us05.lastNameBox.sendKeys(lastName);
    }

    @And("SSN numarasi olarak {string} girer")
    public void ssnNumarasiOlarakGirer(String ssn) {
        //Driver.getDriver().wait(1);
        us05.ssnBox.sendKeys(ssn);
    }

    @And("Email adresi olarak {string} girer")
    public void emailAdresiOlarakGirer(String email) {
        //Driver.getDriver().wait(1);
        us05.emailBox.sendKeys(email);
    }

    @And("Telefon numarasi olarak {string} girer")
    public void telefonNumarasiOlarakGirer(String phone) {
        us05.phoneBox.sendKeys(phone);

    }

    @And("Appointment Date olarak {string} girer")
    public void appointmentDateOlarakGirer(String date) {


        us05.appointmentDateBox.sendKeys(date);

    }

    @Then("Send an Appointment Request butonuna tiklar.")
    public void sendAnAppointmentRequestButonunaTiklar() {


        us05.sendAppointmentRequestButton.click();

    }

    @And("Kullanici sign in butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {

        us05.giriskismi.click();

        us05.signIn.click();
    }

    @And("Kullanici giris bilgilerini eksiksiz doldurur")
    public void kullaniciGirisBilgileriniEksiksizDoldurur() {

        us05.userNameBox.sendKeys("Cancikmaz",Keys.ENTER);
        us05.passwordBox.sendKeys("Ruhidayi.123",Keys.ENTER);
    }

    @And("kullanici randevularini görür")
    public void kullaniciRandevulariniGörür() {
        us05.myPageButton.click();
        us05.myAppointmentButton.click();
        String expected = "ID";
        String actual = us05.idYazisi.getText();
        Assert.assertEquals(expected,actual);


    }
/*
    @And("Kullanici {string} ve {string} girer")
    public void kullaniciVeGirer(String userName, String sifre) {

        us05.userNameBox.sendKeys("Cancikmaz",Keys.TAB,"Ruhidayi.123",Keys.ENTER);

 */

}

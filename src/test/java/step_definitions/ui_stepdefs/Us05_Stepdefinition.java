package step_definitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPageFth;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.ReusableMethods;


public class Us05_Stepdefinition {

    MedunnaPageFth us05 = new MedunnaPageFth();
    WebDriver driver = new ChromeDriver();
    Actions act = new Actions(driver);

    @Given("Kullanici  {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(2);

    }

        @Then("Make an Appointment sekmesine tiklar")
        public void makeAnAppointmentSekmesineTiklar() {


        ReusableMethods.bekle(2);


            us05.makeAppointmentButton.click();

        }

    @And("isim olarak {string} girer")
    public void isimOlarakGirer(String firstName) {
        ReusableMethods.bekle(1);
        us05.firstNameBox.sendKeys(firstName);
    }

    @And("soy isim {string} girer")
    public void soyIsimGirer(String lastName) {

        ReusableMethods.bekle(1);

        us05.lastNameBox.sendKeys(lastName);
    }

    @And("SSN numarasi olarak {string} girer")
    public void ssnNumarasiOlarakGirer(String ssn) {
        ReusableMethods.bekle(1);
        us05.ssnBox.sendKeys(ssn);
    }

    @And("Email adresi olarak {string} girer")
    public void emailAdresiOlarakGirer(String email) {
        ReusableMethods.bekle(1);
        us05.emailBox.sendKeys(email);
    }

    @And("Telefon numarasi olarak {string} girer")
    public void telefonNumarasiOlarakGirer(String phone) {
        ReusableMethods.bekle(1);
        us05.phoneBox.sendKeys(phone);

    }

    @And("Appointment Date olarak {string} girer")
    public void appointmentDateOlarakGirer(String date) {

    ReusableMethods.bekle(2);
        us05.appointmentDateBox.sendKeys(date);

    }

    @Then("Send an Appointment Request butonuna tiklar.")
    public void sendAnAppointmentRequestButonunaTiklar() {

    ReusableMethods.bekle(1);
        us05.sendAppointmentRequestButton.click();

    }

    @And("Kullanici sign in butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {

        us05.giriskismi.click();

        ReusableMethods.bekle(2);
        us05.signIn.click();
        ReusableMethods.bekle(2);



        us05.signIn.click();

        ReusableMethods.bekle(2);
        us05.signIn.click();
        ReusableMethods.bekle(1);

    }

    @And("Kullanici giris bilgilerini eksiksiz doldurur")
    public void kullaniciGirisBilgileriniEksiksizDoldurur() {

        us05.userNameBox.sendKeys("Cancikmaz",Keys.ENTER);



        ReusableMethods.bekle(1);

        us05.passwordBox.sendKeys("Ruhidayi.123",Keys.ENTER);
    }

    @And("kullanici randevularini görür")
    public void kullaniciRandevulariniGörür() {
        us05.myPageButton.click();



        us05.myAppointmentButton.click();


        ReusableMethods.bekle(2);
        us05.myAppointmentButton.click();
        ReusableMethods.bekle(2);
        /*

        String expected = "ID";
        String actual = us05.idYazisi.getText();
        Assert.assertEquals(expected,actual);
         */
        us05.idYazisi.isDisplayed();


    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }

    @And("{string} hata mesajini gorur.")
    public void hataMesajiniGorur(String hata) {
        ReusableMethods.bekle(2);
        us05.firstNameRequiredFeedback.isDisplayed();
    }


    @And("Your SSN is required. hata mesajini gorur")
    public void yourSSNIsRequiredHataMesajiniGorur() {
        ReusableMethods.bekle(2);
        us05.SSNRequiredFeedback.isDisplayed();

    }


/*
    @And("Kullanici {string} ve {string} girer")
    public void kullaniciVeGirer(String userName, String sifre) {

        us05.userNameBox.sendKeys("Cancikmaz",Keys.TAB,"Ruhidayi.123",Keys.ENTER);

 */

}


package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPageFth {


    public MedunnaPageFth(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Sign in']") public WebElement signIn;
    @FindBy(xpath = "//span[text()='Register']")   public WebElement register;

    @FindBy(id = "account-menu")   public WebElement accountMenu;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")   public WebElement giriskismi;
    @FindBy(xpath = "//input[@name='ssn']")   public WebElement ssnBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")   public WebElement SSNFeedback; //h2
    @FindBy(xpath= "//span[text()='MY PAGES(PATIENT)']")   public WebElement myPageButton;
    @FindBy(xpath= "//span[text()='My Appointments']")   public WebElement myAppointmentButton;

    @FindBy(xpath= "//span[text()='ID']")   public WebElement idYazisi;
    @FindBy(xpath= "//span[text()='Make an']")   public WebElement makeAppointmentButton;
    @FindBy(xpath= "//span[text()='Make an Appointment']")   public WebElement makeAppointmentButton2;
    @FindBy(xpath= "//span[text()='Send an Appointment Request']")   public WebElement sendAppointmentRequestButton;
    @FindBy(xpath = "//*[.='Your SSN is required.']")   public WebElement SSNRequiredFeedback;
    @FindBy(xpath = "//*[.='Your FirstName is required.']")   public WebElement firstNameRequiredFeedback;
    @FindBy(xpath = "//*[.='Your LastName is required.']")   public WebElement lastNameRequiredFeedback;
    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")   public WebElement SSNValidFeedback;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")   public WebElement firstNameFeedback;
    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")     public WebElement lastNameFeedback;
    @FindBy(xpath = "//input[@name='username']")    public WebElement userNameBox;
    @FindBy(xpath = "//*[.='Your username is required.']")   public WebElement userNameRequiredFeedback;
    @FindBy(xpath = "//input[@name='email']")    public WebElement emailBox;//input[@id='phone']
    @FindBy(xpath = "//input[@id='phone']")    public WebElement phoneBox;
    @FindBy(xpath = "//input[@id='appoDate']")    public WebElement appointmentDateBox;
    @FindBy(xpath = "//*[.='Your email is required.']")   public WebElement emailRequiredFeedback;
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[5]/div")   public WebElement emailInvalidFeedback;

    @FindBy(xpath = "//*[@id='password']")   public WebElement passwordBox;
    @FindBy(xpath = "//*[@id='firstPassword']")   public WebElement newPasswordBox; //*[@id='password']
    @FindBy(xpath = "//*[.='Your password is required to be at least 4 characters.']")
    public WebElement invalidPasswordFeedback;
    @FindBy(xpath = "//*[text()='Administration']") public WebElement girisText;
    @FindBy(xpath = "//*[@id='rememberMe']") public WebElement rememberMe;
    @FindBy(xpath = "//*[text()='Did you forget your password?']") public WebElement didYouForget;
    @FindBy(xpath = "//*[text()='Enter the email address you used to register']") public WebElement resetPassword;
    @FindBy(xpath = "//*[text()='Register a new account']") public WebElement accountGo;
    @FindBy(xpath = "//*[text()='Cancel']") public WebElement cancel;
    @FindBy(xpath = "//*[@id='app-view-container']") public WebElement anaSayfa;
    @FindBy(xpath = "Sign out") public WebElement signOut;





}

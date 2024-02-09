package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage_omer {
    public RegisterPage_omer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement accountmenu_o;

    @FindBy(xpath = "//*[@class='dropdown-item'][2]")
    public WebElement registermenu_o;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn_o;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstname_o;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastname_o;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username_o;

    @FindBy(id = "email")
    public WebElement email_o;

    @FindBy(name = "firstPassword")
    public WebElement firstPass_o;

    @FindBy(xpath = "//*[.='Registration Saved']")
    public WebElement regSavedAlert_o;

    @FindBy(xpath = "//*[.='Your SSN is invalid']")
    public WebElement invalidSSN_o;

    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement requiredSSN_o;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement requiredFN_o;

    @FindBy(xpath = "//*[.='Your LastName is required.']")
    public WebElement requiredLN_o;

    @FindBy(xpath = "//*[.='Your username is required.']")
    public WebElement requiredUN_o;

    @FindBy(xpath = "//*[.='This field is invalid']")
    public WebElement invalidEmail_o;

    @FindBy(xpath = "//*[.='Your email is required.']")
    public WebElement requiredEmail_o;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 0, 0);']")
    public WebElement redCol_o;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 153, 0);']")
    public WebElement orangeCol_o;

    @FindBy(xpath = "//*[@style='background-color: rgb(153, 255, 0);']")
    public WebElement greenCol_o;

    @FindBy(xpath = "//*[@style='background-color: rgb(0, 255, 0);']")
    public WebElement darkgreenCol_o;

    //  //*[@style='background-color: rgb(255, 0, 0);']


    /*
    <div role="alert" class="Toastify__toast-body">Registration Saved</div>
    */


}

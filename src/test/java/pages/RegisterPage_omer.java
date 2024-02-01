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

    /*
    <div role="alert" class="Toastify__toast-body">Registration Saved</div>
    */


}

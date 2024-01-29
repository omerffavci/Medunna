package pages.us_1_2_3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn_o;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstname_o;

}

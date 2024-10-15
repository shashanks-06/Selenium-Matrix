package Part3.Sel7.Oct15_2024_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//    Step 1 -> Declaration
    @FindBy(xpath = "//input[@id='user-name']") private WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']") private WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement loginButtonField;

//    Step 2 -> Initialization
//    "Initialize all WebElements in this instance of the LoginPage class using the provided WebDriver."
    public LoginPage(WebDriver driver){     // This is Parameterized constructor
        PageFactory.initElements(driver, this);
    }

//    Step 3 -> Utilization

    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButtonField.click();
    }

}

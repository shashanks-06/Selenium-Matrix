package Part4.TestNG_November.Nov08_2024_POM_and_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mtx72_LoginPage {

//    Find WebElements of login page

    @FindBy(css = "[placeholder=\"Username\"]") private WebElement usernameField;
    @FindBy(css = "[placeholder=\"Password\"]") private WebElement passwordField;
    @FindBy(css = "[type=\"submit\"]") private WebElement loginBtn;

    @FindBy(css = "[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]") private WebElement invalidCredField;


//    Parameterized constructor
    public Mtx72_LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
       passwordField.sendKeys(password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public String getInvalidCredMessageElement(){
        return invalidCredField.getText();
    }

}

package Part3.Sel7.Oct16_2024_PomWithDDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.NoSuchFileException;

public class LoginPageDDT {
    WebDriver driver;

//    Step 1 -> Declaration
    @FindBy(xpath = "//input[@id='user-name']") private WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']") private WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement loginButtonField;

    //    Step 2 -> Initialization
//    "Initialize all WebElements in this instance of the LoginPage class using the provided WebDriver."
    public LoginPageDDT(WebDriver driver){
        this.driver = driver;
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

    // Method to check if login was successful
    public boolean isLoginSuccessFull(){
        try{
            //    For not login to homepage
            driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            return true;    // Login is successful
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;  // Login failed
        }
    }

}

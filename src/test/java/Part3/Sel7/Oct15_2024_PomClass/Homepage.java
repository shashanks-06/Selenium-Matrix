package Part3.Sel7.Oct15_2024_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
//    Step 1 -> Declaration
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']") private WebElement bikeButton;
    @FindBy(xpath = "//button[@id='add-to-cart']") private WebElement cartButton;

//    Step 2 -> Initialization
//    "Initialize all WebElements in this instance of the LoginPage class using the provided WebDriver."
    public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //    Step 3 -> Utilization

    public void clickBikeButton(){
        bikeButton.click();
    }

    public void clickCartButton(){
        cartButton.click();
    }
}

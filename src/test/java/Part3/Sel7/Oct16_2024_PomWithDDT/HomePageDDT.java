package Part3.Sel7.Oct16_2024_PomWithDDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDDT {
//    Step 1 -> Declaration
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement cartButton;

    //    Step 2 -> Initialization
//    "Initialize all WebElements in this instance of the LoginPage class using the provided WebDriver."
    public HomePageDDT(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //    Step 3 -> Utilization
    public void clickCartButton(){
        cartButton.click();
    }
}

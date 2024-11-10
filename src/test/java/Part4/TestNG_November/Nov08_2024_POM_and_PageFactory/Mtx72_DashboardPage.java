package Part4.TestNG_November.Nov08_2024_POM_and_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Mtx72_DashboardPage {
    WebDriver globalDriver;

    public Mtx72_DashboardPage(WebDriver driver){
        globalDriver = driver;
        PageFactory.initElements(globalDriver, this);
    }

    public String getPageTitle(){
        return globalDriver.getTitle();
    }
}

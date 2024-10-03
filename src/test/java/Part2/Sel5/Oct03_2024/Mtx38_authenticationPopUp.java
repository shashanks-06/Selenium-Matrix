package Part2.Sel5.Oct03_2024;

//  Authenticated PopUp

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx38_authenticationPopUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
    }
}

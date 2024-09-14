import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx03 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");

        //        TO GET CURRENT URL OF WEBSITE
        String expectedUrl = "https://www.flipkart.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL Matching");
            System.out.println(actualUrl);
        }else{
            System.out.println("URL Not Matching");
        }

        driver.quit();
    }

}

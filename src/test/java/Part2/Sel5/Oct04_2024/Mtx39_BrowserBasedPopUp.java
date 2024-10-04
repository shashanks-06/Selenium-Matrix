package Part2.Sel5.Oct04_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;

public class Mtx39_BrowserBasedPopUp {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();

        HashMap<String, Integer> contentSettings = new HashMap<String,Integer>();
        HashMap<String, Object> profile = new HashMap<String, Object>();
        HashMap<String, Object> prefs = new HashMap<String, Object>();

        contentSettings.put("notifications", 2);  // Three options available -> 0(default), 1(Allow), 2(Block)
//        contentSettings.put("geolocation", 2);
//        contentSettings.put("media_stream", 2);
        profile.put("managed_default_content_settings",contentSettings);
        prefs.put("profile", profile);
        option.setExperimentalOption("prefs", prefs);


        WebDriver driver = new ChromeDriver(option);
        driver.get("https://redbus.in/");
//        driver.get("https://whatmylocation.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}

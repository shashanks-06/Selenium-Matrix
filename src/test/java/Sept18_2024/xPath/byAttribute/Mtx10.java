package Sept18_2024.xPath.byAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtx10 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

//        xPath
//        Relative xPath -> By Single Attribute
//        driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("Mobile");

////        By Multiple Attributes -> Here "and" means both or more attributes should be valid otherwise it wil not work
//        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" and @placeholder=\"Search Amazon.in\"]")).sendKeys("Tablet");

        //        By Multiple Attributes -> Here "or" means if one of the attribute is valid then it will work
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" or @placeholder=\"Search mazon.in\"]")).sendKeys("Tablet");
//                                                                                                          Here i made it invalid, but still its working
    }
}

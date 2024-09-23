package Part2.Sel3.Sept23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Mtx22_dropdownMultipleSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();


        List<WebElement> dropDownElements = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
        System.out.println("Size of dropdown elements : " +dropDownElements.size());

//        for (WebElement webElement : dropDownElements){
//            System.out.println(webElement.getText());
//        }

        for (WebElement webElements : dropDownElements){
            String nameOfElement = webElements.getText();
            if (nameOfElement.equals("Python") || nameOfElement.equals("MySQL") || nameOfElement.equals("Angular")){
                webElements.click();
                Thread.sleep(1000);
            }
        }
    }

}

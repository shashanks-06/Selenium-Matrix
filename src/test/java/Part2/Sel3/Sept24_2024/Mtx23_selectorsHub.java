package Part2.Sel3.Sept24_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Mtx23_selectorsHub {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();


        List<WebElement> webElements = driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
        System.out.println("Size of listbox: " + webElements.size());

//        for (WebElement elements : webElements){
//            System.out.print(elements.getText() + " ");
//        }

        for (int i = 1; i < webElements.size() ; i++) {
            WebElement webElement = webElements.get(i);
            System.out.println(i +". "+webElement.getText());
        }


//        driver.findElement(By.xpath("//span[normalize-space()='Quality Assurance']")).click();





    }
}

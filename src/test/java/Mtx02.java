import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// To close(),quit() , maximize() and minimize() , setSize() using Dimension object

public class Mtx02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");

//        driver.close();
//        driver.quit();

        driver.manage().window().minimize();
        //        Thread.sleep(2000);

        driver.manage().window().maximize();
//        Thread.sleep(2000);

        Dimension d = new Dimension(300,300);  // (int width, int height)
        driver.manage().window().setSize(d);
//        Thread.sleep(2000);

        Point p = new Point(900, 400);
        driver.manage().window().setPosition(p);
//        Thread.sleep(2000);




//        driver.close();
        driver.quit();

    }
}

package Part2.Sel3.Sept20_2024_robotClass.keyPress_keyRelease;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Mtx17 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        Robot robot = new Robot();

//      We can add keyRelease() after every keyPress() or only once when all keyPresses are completed

        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_PAGE_UP);
//        robot.keyRelease(KeyEvent.VK_PAGE_UP);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_PAGE_UP);  // Here, all keyPresses are completed
        robot.keyRelease(KeyEvent.VK_PAGE_UP);  // So, finally key is Released


    }
}

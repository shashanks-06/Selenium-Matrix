package Part2.Sel5.Oct01_2024_frames_or_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Mtx34 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        FRAME -->> 1
//        WebElement frameElement1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
//        switch to the first frame
//        driver.switchTo().frame(frameElement1);

        driver.switchTo().frame(0);     // By indexing
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Shashank");

//        To jump to the second frame
//        We have to first change our focus to the main web page frame
        driver.switchTo().defaultContent();     // → IMPORTANT to jump on next frame


//        FRAME -->> 2
//        Now switch to the second frame
//        WebElement frameElement2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
//        driver.switchTo().frame(frameElement2);

        driver.switchTo().frame(1);     // By indexing
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Shashank");

        driver.switchTo().defaultContent();


//        FRAME -->> 3
//        WebElement frameElement3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
//        driver.switchTo().frame(frameElement3);

        driver.switchTo().frame(2);     // By indexing
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Shashank");

//        Now jump to iframe
//        We switch to the iframe 1 by using indexing -> 0
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"][1]")).click();


        driver.switchTo().defaultContent();


//        FRAME -->> 4
//        WebElement frameElement4 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
//        driver.switchTo().frame(frameElement4);

        driver.switchTo().frame(3);     // By indexing
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Shashank");
    }
}

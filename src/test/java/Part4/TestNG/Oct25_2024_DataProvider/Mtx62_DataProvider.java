package Part4.TestNG.Oct25_2024_DataProvider;

import org.testng.annotations.DataProvider;


public class Mtx62_DataProvider {

    @DataProvider(name = "searchDataSet")
    public Object[][] searchData(){
        Object[][] searchKeyword = new Object[3][2];

        searchKeyword[0][0] = "India";
        searchKeyword[0][1] = "Delhi";

        searchKeyword[1][0] = "USA";
        searchKeyword[1][1] = "Washington D.C.";

        searchKeyword[2][0] = "UK";
        searchKeyword[2][1] = "London";

        return searchKeyword;
    }

//    TEST METHOD IS IN THE NEW CLASS SO , NO NEED TO USE THIS
//    @Test(dataProvider = "searchDataSet")
//    public void TC_googleSearch(String country, String capitalCity) throws Throwable {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
//        searchField.sendKeys(country + " " + capitalCity, Keys.ENTER);
//
//        Thread.sleep(2000);
//
//        driver.quit();
////        driver.close();
//    }
}

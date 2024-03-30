package productstore.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import productstore.manager.HomePageProductStore;

public class TestBase {
    WebDriver driver;
    HomePageProductStore homePageProductStoreObject ;
    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }
}

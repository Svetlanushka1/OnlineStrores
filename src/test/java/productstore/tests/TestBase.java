package productstore.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import productstore.manager.HomePageProductStore;

public class TestBase {
    WebDriver driver;
    HomePageProductStore homePageProductStoreObject  = new HomePageProductStore(driver);

    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }
    @AfterSuite
    public void setDriver(){
        //driver.quit();
    }
    public void pause(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

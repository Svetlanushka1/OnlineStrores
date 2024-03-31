package productstore.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class HomePageProductStore {
    WebDriver driver;
    @FindBy(xpath = "//a[@id='nava']")
    WebElement logoId;
    @FindBy(xpath = "//div[@id='carouselExampleIndicators']")
    WebElement carouselId;
    /*
    @FindBy(className = "nav-item.active")
    WebElement tabsList;*/
    @FindBy(css = "li[class='nav-item active'] a[class='nav-link']")
    WebElement tabHome;//"Home "
   // @FindBy(css = "div[id='navbarExample'] li:nth-child(1)")
   // @FindBy(css = "a[data-target='#exampleModal']")
    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[2]/a")
    WebElement tabContact;
    @FindBy(xpath = "//h5[@id = 'exampleModalLabel']")
    WebElement contactModalId;
    @FindBy(xpath = "//div[@id='exampleModal']//button[@type='button'][normalize-space()='Close']")
    WebElement tabContactCloseBtn;
    @FindBy(css = "div[id='navbarExample'] li:nth-child(2)")
    WebElement tabAbout;//About us
    @FindBy()
    WebElement tabAboutCloseBtn;
    @FindBy(css = "div[id='navbarExample'] li:nth-child(3)")////*[@id="navbarExample"]/ul/li[3]/a
    WebElement tabCart;//   Cart
    @FindBy(css = "div[id='navbarExample'] li:nth-child(4)")
    WebElement tabBlog;

    public HomePageProductStore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getLogoName(){
    return logoId.getText();
    }

    public void clickOnContactTabs() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tabContact.click();

    }
    public void closeTabContact(){
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tabContactCloseBtn.click();
    }
    public String getTitleName() {
        return contactModalId.getText();
    }

    public void clickOnHomeTab(){
        tabHome.click();
    }
    public void clickOnAboutTab(){
        tabAbout.click();
        tabAboutCloseBtn.click();
    }
    public void clickOnCarouselSlide(){
        ////div[@id='carouselExampleIndicators']

    }



}

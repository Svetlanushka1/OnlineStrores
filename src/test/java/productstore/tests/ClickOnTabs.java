package productstore.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import productstore.manager.HomePageProductStore;

public class ClickOnTabs extends TestBase{
    @Test
    public void contactPageAppearsCorrect(){

        homePageProductStoreObject.clickOnContactTabs();

        Assert.assertTrue(homePageProductStoreObject.getTitleName().toLowerCase().contains("new message"));
        homePageProductStoreObject.closeTabContact();

    }

}

package productstore.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import productstore.manager.HomePageProductStore;

public class LogoTests extends TestBase{

    @Test
    public void testHomePageAppearsCorrect(){
    String logoName = homePageProductStoreObject.getLogoName();
    Assert.assertTrue(logoName.toLowerCase().contains("product store"));

    }

}

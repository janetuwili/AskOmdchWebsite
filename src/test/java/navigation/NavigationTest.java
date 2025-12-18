package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigation(){
        var storePage = homePage.clickStore();
        assertTrue(storePage.isStorePageLoaded(),"store page is not loaded");
        var menPage = homePage.clickMen();
        assertTrue(menPage.isMenPageLoaded(),"Men page is not loaded");
        var womenPage = homePage.clickWome();
        assertTrue(womenPage.isWomenPageLoaded(),"Women page is not loaded");
        var accessoriesPage = homePage.clickAccessories();
        assertTrue(accessoriesPage.isAccessoriesPageLoaded(),"Accessories page is not loaded");
        var acountPage = homePage.clickAccount();
        assertTrue(accessoriesPage.isAccessoriesPageLoaded(),"Accessories page is not loaded");
       var contactPage =  homePage.clickContact();
       assertTrue(contactPage.isContactPageLoaded(),"Contact page is not displayed");
       var aboutPage = homePage.clickAbout();
       assertTrue(aboutPage.isAboutPageLoaded(),"About page is not loaded");


    }
}

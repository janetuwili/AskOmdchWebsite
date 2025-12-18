package search;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {
    @Test
    public void testSearch(){
       var storePage = homePage.clickStore();
       storePage.getHeader().enterSearchProduct("Green Tshirt");
       storePage.getHeader().clickSearchButton();
        SearchResultsPage results = new SearchResultsPage(driver);
        assertTrue(results.areResultDisplayed(),"Search results are not displayed");
        //System.out.println("First result is:"+ results.);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionProducts = By.id("main");
    private By productTitle = By.cssSelector("h1.product_title.entry-title");

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public boolean areResultDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionProducts)).isDisplayed();
    }
    private String getFirstResultTitle(){
        return driver.findElement(productTitle).getText();
    }

}

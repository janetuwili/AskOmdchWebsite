package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private HeaderComponent header;
    private By sectionStore = By.id("main");

    public StorePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.header = new HeaderComponent(driver);// Selenium 3 style
    }
    public HeaderComponent getHeader(){
        return header;

    }

    public boolean isStorePageLoaded(){
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(sectionStore)
        ).isDisplayed();
    }
}

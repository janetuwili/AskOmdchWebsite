package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessoriesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionAccessories = By.id("main");
    public AccessoriesPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public boolean isAccessoriesPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionAccessories)).isDisplayed();
    }
}

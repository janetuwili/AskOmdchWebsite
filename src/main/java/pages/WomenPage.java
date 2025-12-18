package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.DocFlavor;

public class WomenPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionWomen = By.id("main");
    public WomenPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }
    public boolean isWomenPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionWomen)).isDisplayed();
    }
}

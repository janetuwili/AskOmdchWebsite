package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionContact = By.id("main");
    public  ContactPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public boolean isContactPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionContact)).isDisplayed();
    }
}

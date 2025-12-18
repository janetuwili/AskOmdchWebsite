package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionAbout = By.id("main");
    public AboutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public boolean isAboutPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionAbout)).isDisplayed();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By sectionMen = By.id("main");
    public MenPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public boolean isMenPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sectionMen)).isDisplayed();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToCartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By addToCartProducts = By.cssSelector("[data-product_id='1198']");
    private By viewCart = By.cssSelector("a.added_to_cart.wc-forward");
    private By text = By.cssSelector("h1.has-text-align-center");

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Click Add to Cart
    public boolean clickAddToCart(){
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCartProducts));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
        return true;
    }

    // Click View Cart (wait until it appears)
    public CartPage clickViewCart(){
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(viewCart));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);
        view.click();
        return new CartPage(driver);
    }

    // Check if Add to Cart button is visible
    public boolean isAddToCartSuccessfully(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartProducts)).isDisplayed();
    }

    // Check if View Cart link appeared
    public boolean isViewCartSuccessfull(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(viewCart)).isDisplayed();
    }


}

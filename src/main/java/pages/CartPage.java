package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By quantity = By.cssSelector("input[title='Qty']");
    private By updateButton = By.cssSelector("button[name='update_cart']");
    private By subTotal = By.cssSelector("td.product-subtotal");

    public CartPage(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(driver,10);
    }
    public void setQuantity(int newQty){
        WebElement set = wait.until(ExpectedConditions.visibilityOfElementLocated(quantity));
        set.clear();
        set.sendKeys(String.valueOf(newQty));


    }
    public void clickUpdateCart(){
        WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(updateButton));
        update.click();
    }
    public String getSubTotal(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(subTotal)).getText();
    }
    public boolean getUpdatedSubTotal(int newQty){
        setQuantity( newQty);
        clickUpdateCart();
        return true;


    }
}

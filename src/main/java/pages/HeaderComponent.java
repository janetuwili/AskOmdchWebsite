package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderComponent {
    private WebDriver driver;
    private WebDriverWait wait;
    private By searchProduct = By.id("woocommerce-product-search-field-0");
    private By searching = By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button");



    public HeaderComponent(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public void enterSearchProduct(String products){
        driver.findElement(searchProduct).clear();
        driver.findElement(searchProduct).sendKeys(products);

    }
    public void clickSearchButton(){
        driver.findElement(searching).click();
    }
}

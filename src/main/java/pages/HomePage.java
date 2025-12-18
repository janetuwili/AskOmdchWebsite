package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // private By accountLink = By.linkText("Account");

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public RegisterAccount clickAccount(){
        //driver.findElement(accountLink).click();
        clickLink("Account");
        return new RegisterAccount(driver);

    }
    public StorePage clickStore(){
        clickLink("Store");
        return new StorePage(driver);
    }
    public MenPage clickMen(){
        clickLink("Men");
        return new MenPage(driver);
    }
    public WomenPage clickWome(){
        clickLink("Women");
        return  new WomenPage(driver);
    }
    public AccessoriesPage clickAccessories(){
        clickLink("Accessories");
        return new AccessoriesPage(driver);
    }
    public AccountPage clickAccounts(){
        clickLink("Account");
        return new AccountPage(driver);
    }
    public AboutPage clickAbout(){
        clickLink("About");
        return  new AboutPage(driver);
    }
    public ContactPage clickContact(){
        clickLink("Contact Us");
        return new ContactPage(driver);
    }
    public AddToCartPage clickAddToCart(){
        clickLink("ADD TO CART");
        return new AddToCartPage(driver);

    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }






}

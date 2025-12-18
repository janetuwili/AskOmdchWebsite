package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {
    private WebDriver driver;
    private By usernameField = By.id("reg_username");
    private By emailField = By.id("reg_email");
    private By passwordField = By.id("reg_password");
    private By registerButton =By.cssSelector("button[name='register']");
    private By status =By.cssSelector("div.woocommerce-MyAccount-content p");

    private By usernamesField = By.id("username");
    private By passwordsField = By.id("password");
    private By loginButton = By.cssSelector("button[name='login']");
    private By dashbordInfo = By.cssSelector(".woocommerce-MyAccount-navigation ul");
    public RegisterAccount(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);

    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);

    }
    public String register(){
        driver.findElement(registerButton).click();
     return driver.findElement(status).getText();
    }
    public void setUsernames(String username){
        driver.findElement(usernamesField).sendKeys(username);

    }
    public void setPasswords(String password){
        driver.findElement(passwordsField).sendKeys(password);

    }
    public String login(){
        driver.findElement(loginButton).click();
        return driver.findElement(status).getText();
    }
}

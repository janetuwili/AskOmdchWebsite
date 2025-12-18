package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);


    }
    @AfterClass
    public void tearDown(){
        if(driver !=null){
        driver.quit();
        }

    }


}

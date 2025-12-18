package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterAccount;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin(){
       var loginPage = homePage.clickAccount();
       String  username= "uwamahoro5";
       loginPage.setUsernames(username);
       loginPage.setPasswords("12345");
        String actualResult  = loginPage.login();
        String expectedResult = "Hello "+username+" (not "+username+"? Log out)";
        assertEquals(actualResult,expectedResult,"Something went wrong");




    }
}

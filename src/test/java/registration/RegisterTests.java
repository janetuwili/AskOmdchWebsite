package registration;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterTests extends BaseTest {
    @Test
    public void testRegister(){
        var registerAccount = homePage.clickAccount();
        String username ="uwamahoro5";
        registerAccount.setUsername(username);
        registerAccount.setEmail("uwamahoro5@gmail.com");
        registerAccount.setPassword("12345");
        String actualResult  = registerAccount. register();
       String expectedResult = "Hello "+username+" (not "+username+"? Log out)";
       assertEquals(actualResult,expectedResult,"Something went wrong");


    }
}

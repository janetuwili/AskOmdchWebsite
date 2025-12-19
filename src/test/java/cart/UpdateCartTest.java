package cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UpdateCartTest extends BaseTest {
    @Test
    public void testUpdateCart(){
       var addToCartPage = homePage.clickAddToCart();
       addToCartPage.clickAddToCart();
       var updateCartPage =addToCartPage.clickViewCart();
       //updateCartPage.setQuantity(2);
       updateCartPage.clickUpdateCart();
        //String subTotal = updateCartPage.getSubTotal();
        assertEquals(updateCartPage.getSubTotal(),"$45.00","available");

        assertTrue(updateCartPage.getUpdatedSubTotal(7),"not updated");


    }
}

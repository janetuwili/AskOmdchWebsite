package cart;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart(){
        var addCart = homePage.clickAddToCart();
        assertTrue(addCart.clickAddToCart(),"add to cart was not clicked");
        assertEquals(addCart.clickViewCart(),"pages.CartPage@75e01201","link not clicked");
        assertTrue(addCart.isViewCartSuccessfull(),"not succefuly");

            }
}

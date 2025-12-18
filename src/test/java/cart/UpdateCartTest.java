package cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UpdateCartTest extends BaseTest {
    @Test
    public void testUpdateCart(){
       var addToCartPage = homePage.clickAddToCart();
       addToCartPage.clickAddToCart();
       var updateCartPage =addToCartPage.clickViewCart();
        String updatedCartSubTotal = updateCartPage.getUpdatedCartSubTotal(2);
        Assert.assertNotEquals(updatedCartSubTotal,updateCartPage.getSubTotal(),"cart not updated");


    }
}

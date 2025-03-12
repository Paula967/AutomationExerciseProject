package TestPackage;

import org.testng.annotations.Test;

public class TestRemoveProductFromCart extends BaseClass{

    @Test(priority = 25)
    public void Verify_that_Product_Deleted_Successfully(){

        registerUserPage
                .navigateToURL()
                .clickOnProductsButton()
                .addProductToCart(1)
                .clickOnViewCart()
                .DeleteItemByIndex(1)
                .assertDeletedProductMessage();

    }
}

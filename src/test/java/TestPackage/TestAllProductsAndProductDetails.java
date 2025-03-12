package TestPackage;

import GuiPages.AllProductsPage;
import org.testng.annotations.Test;

public class TestAllProductsAndProductDetails extends BaseClass{

    protected AllProductsPage AllProductsPage;

    @Test(priority = 14)
    public void Verify_that_User_Is_Navigated_To_AllProductsPage_successfully(){

        AllProductsPage =registerUserPage.clickOnProductsButton();
        AllProductsPage.assertUserIsNavigatedToAllProductPage(AllProductsPage.getPageURL(),
                URLTestData.getTestData("AllProductsURL"),
                "Verify That user is navigated To All Products Page");

    }
    @Test(priority = 15)
    public void Verify_that_ProductsList_Is_Visible_Successfully(){
        AllProductsPage.
                assertProductListIsVisible();
    }
    @Test(priority = 16)
    public void Verify_that_ProductDetails_Is_Visible(){
        AllProductsPage.
                clickViewProductByIndex(1).
                assertProductDetailsIsVisible();
    }

}

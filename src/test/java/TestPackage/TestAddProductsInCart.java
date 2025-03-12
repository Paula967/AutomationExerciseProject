package TestPackage;

import GuiPages.AllProductsPage;
import GuiPages.ViewCartPage;
import com.shaft.validation.Validations;
import org.testng.annotations.Test;

public class TestAddProductsInCart extends BaseClass{

    protected AllProductsPage allProductsPage;
    protected ViewCartPage viewCartPage;
    protected GuiPages.ProductDetailsPage ProductDetailsPage;
    int enterteredQuantity;
    int expectedQuantity;

    @Test(priority = 19)
    public void Verify_that_productAddedInCart_Successfully(){
        int firstProductIndex=1;
        int secondProductIndex=2;

        allProductsPage=registerUserPage
                .navigateToURL()
                .clickOnProductsButton();

        String actualFirstProductName =allProductsPage
                .addProductToCart(firstProductIndex)
                .clickOnContinueShopping()
                .getProductNameByIndex(firstProductIndex);

        String actualSecondProductName=allProductsPage
                .getProductNameByIndex(secondProductIndex);

        viewCartPage=allProductsPage
                .addProductToCart(secondProductIndex)
                .clickOnViewCart();

        String expectedFirstProductName=viewCartPage
                .getProductNameByIndex(1);
        String expectedSecondProductName=viewCartPage
                .getProductNameByIndex(2);

        viewCartPage.assertEqaulity(actualFirstProductName,expectedFirstProductName,
                "Products are not the same ");
        viewCartPage.assertEqaulity(actualSecondProductName,expectedSecondProductName,
                "Products are not the same");

    }

    @Test(priority = 20)
    public void Verify_ProductDetails_Is_Opened_Successfully(){
        ProductDetailsPage =registerUserPage
                .navigateToURL()
                .clickOnViewProductByIndex(2);
        Validations
                .assertThat()
                .object(ProductDetailsPage.getPageURL())
                .contains(URLTestData.getTestData("ProductDetailsURL"));
    }
    @Test(priority = 21)
    public void Verify_that_product_is_displayed_in_cart_page_with_exact_quantity(){
         enterteredQuantity=ProductDetailsPage
                .enterProductQuantity(4)
                .clickOnAddToCartButton()
                .getProductQuantity();
         viewCartPage=ProductDetailsPage.clickOnViewCartButton();
    }
    @Test(priority = 22)
    public void Verify_that_product_is_displayed_in_cart_page_with_correct_quantity(){
        viewCartPage.DeleteItemByIndex(1);
        enterteredQuantity++;
        expectedQuantity=viewCartPage.getProductQuantity();
        viewCartPage.assertEqaulity(String.valueOf(enterteredQuantity),
                String.valueOf(expectedQuantity),"Quantities Are not Equal");

    }

}

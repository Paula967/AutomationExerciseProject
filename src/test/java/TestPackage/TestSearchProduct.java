package TestPackage;

import GuiPages.SearchedProductResultPage;
import org.testng.annotations.Test;

public class TestSearchProduct extends BaseClass{

   protected SearchedProductResultPage searchedProductResultPage;

   @Test(priority = 17)
    public void Verify_that_SearchedProduct_Is_visible(){

       searchedProductResultPage
               =registerUserPage
               .clickOnProductsButton()
               .searchForSpecificProduct
               (
                     ProductNametestData.getTestData("ProductName")
               )
               .assertSearchedProductResultPageMessage();

   }
   @Test(priority = 18)
    public void Verify_that_AllProductsRelatedToSearch_are_Visible(){
       searchedProductResultPage
               .assertSearchResultsPageAreVisible(searchedProductResultPage.getProductName(),
               ProductNametestData.getTestData("ProductName"),
               "Verify all the products related to search are visible");
    }

}

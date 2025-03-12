package GuiPages;

import com.shaft.driver.SHAFT;


public class AllProductsPage extends BasePage{
    public AllProductsPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public String getPageURL(){
        return driver.browser().getCurrentURL();
    }

    public ProductDetailsPage clickViewProductByIndex(int index){
        clickElement(locatorType.XPATH,"(//a[contains(text(),'View Product')])["+index+"]");
        return new ProductDetailsPage(driver);
    }
    public SearchedProductResultPage searchForSpecificProduct(String ProductName){
        enterText(locatorType.XPATH,"//input[@id='search_product']",ProductName);
        clickElement(locatorType.XPATH,"//button[@id='submit_search']");
        return new SearchedProductResultPage(driver);
    }

    public void assertProductListIsVisible() {
        assertElementIsVisible(locatorType.XPATH,"//div[@class='features_items']");
    }
    public String getProductNameByIndex(int index){
        return getText(locatorType.XPATH,"(//div[@class='product-overlay']/div/p)["+index+"]");
    }
    public AllProductsPage addProductToCart(int index){
        index=index+(index-1);
        clickElement(locatorType.XPATH,"(//a[contains(text(),'Add to cart')])["+index+"]");
        return this;
    }
    public AllProductsPage clickOnContinueShopping(){
        clickElement(locatorType.XPATH,"//button[normalize-space()='Continue Shopping']");
        return this;
    }
    public ViewCartPage clickOnViewCart(){
        clickElement(locatorType.CSS,"p[class='text-center'] a");
        return new ViewCartPage(driver);
    }
    public void assertUserIsNavigatedToAllProductPage(String Ob1,String Ob2,String Message){
        assertElementsEqual(Ob1,Ob2,Message);
    }

}

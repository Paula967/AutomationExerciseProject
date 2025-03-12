package GuiPages;

import com.shaft.driver.SHAFT;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public String getPageURL(){
        return getURL();
    }
    public void assertProductDetailsIsVisible(){
        assertElementIsVisible(locatorType.CSS,"div[class='product-information'] h2");
        assertElementIsVisible(locatorType.XPATH,"//p[normalize-space()='Category: Women > Tops']");
        assertElementIsVisible(locatorType.XPATH,"//b[normalize-space()='Availability:']");
        assertElementIsVisible(locatorType.XPATH,"//b[normalize-space()='Condition:']");
        assertElementIsVisible(locatorType.XPATH,"//b[normalize-space()='Brand:']");
    }
    public ProductDetailsPage enterProductQuantity(int Quantity){
        enterText(locatorType.CSS,"#quantity",String.valueOf(Quantity));
        return this;
    }
    public ProductDetailsPage clickOnAddToCartButton(){
        clickElement(locatorType.CSS,"button[type='button']");
        return this;
    }
    public ViewCartPage clickOnViewCartButton(){
        clickElement(locatorType.CSS,"p[class='text-center'] a");
        return new ViewCartPage(driver);
    }
    public Integer getProductQuantity(){
        String QuantityText= getText(locatorType.CSS,"#quantity");
        return Integer.parseInt(QuantityText);
    }

}

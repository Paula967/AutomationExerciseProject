package GuiPages;

import com.shaft.driver.SHAFT;

public class ViewCartPage extends BasePage{

    public ViewCartPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public String getProductNameByIndex(int index){
        return getText(locatorType.XPATH,"(//td[@class='cart_description']/h4/a)["+index+"]");
    }
    public Integer getProductQuantity(){
        String QuantityText=getText(locatorType.XPATH,"(//td[@class='cart_quantity']/button)[2]");
        return Integer.parseInt(QuantityText);

    }
    public CheckoutPage clickOnProceedToCheckOutButton(){
        clickElement(locatorType.CSS,".btn.btn-default.check_out");
        return new CheckoutPage(driver);
    }
    public ViewCartPage DeleteItemByIndex(int index){
        clickElement(locatorType.XPATH,"(//a[@class='cart_quantity_delete'])["+index+"]");
        return this;
    }
    public void assertDeletedProductMessage(){
        assertElementIsVisible(locatorType.CSS,"p[class='text-center'] b");
    }
    public void assertEqaulity(String ob1, String ob2, String Message){
        assertElementsEqual(ob1,ob2,Message);
    }

}

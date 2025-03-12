package GuiPages;

import com.shaft.driver.SHAFT;

public class LoginPage extends BasePage{

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public LoginPage assertLoggedInUserName(){
        assertElementIsVisible(locatorType.CSS,"li:nth-child(10) a:nth-child(1)");
        return this;
    }
    public LoginPage clickOnLogout(){
        clickElement(locatorType.CSS,"a[href='/logout']");
        return new LoginPage(driver);
    }
    public String getPageURL(){
        return getURL();
    }
    public AllProductsPage clickOnProductsButton(){
        clickElement(locatorType.CSS,"a[href='/products']");
        return new AllProductsPage(driver);
    }
    public LoginPage addProductToCart(int index){
        index=index+(index-1);
        clickElement(locatorType.XPATH,"(//a[contains(text(),'Add to cart')])["+index+"]");
        return this;
    }
    public ViewCartPage clickOnViewCartButton(){
        clickElement(locatorType.CSS,"p[class='text-center'] a");
        return new ViewCartPage(driver);
    }
    public void assertUserNavigatedToLoginURL(String Ob1, String Ob2, String Message){
        assertElementsEqual(Ob1,Ob2,Message);
    }

}

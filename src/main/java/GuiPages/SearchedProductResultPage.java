package GuiPages;

import com.shaft.driver.SHAFT;

public class SearchedProductResultPage extends BasePage{
    public SearchedProductResultPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public String getProductName(){
        return  getText(locatorType.CSS,"div[class='productinfo text-center'] p");

    }
    public SearchedProductResultPage assertSearchedProductResultPageMessage(){
        assertElementIsVisible(locatorType.XPATH,"//h2[normalize-space()='Searched Products']");
        return this;
    }
    public void assertSearchResultsPageAreVisible(String Obj1,String Obj2, String Message){
        assertElementsEqual(Obj1,Obj2,Message);
    }
}

package GuiPages;

import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;

public class BasePage {
    protected static SHAFT.GUI.WebDriver driver;

    public enum locatorType{
        ID, NAME, CSS, XPATH
    }
    public BasePage(SHAFT.GUI.WebDriver driver) {
        BasePage.driver = driver;
    }
    protected By getLocator(locatorType type, String value) {
        switch (type) {
            case ID: return By.id(value);
            case NAME: return By.name(value);
            case CSS: return By.cssSelector(value);
            case XPATH: return By.xpath(value);
            default: throw new IllegalArgumentException("Invalid locator type: " + type);
        }
    }

    protected void clickElement(locatorType type, String value) {
        driver.element().click(getLocator(type,value));
    }

    protected void enterText(locatorType type, String value, String text) {
        driver.element().type(getLocator(type,value),text);
    }
    protected String getText(locatorType type,String value){
       return driver.element().get().text(getLocator(type,value));
    }

    protected void selectElement(locatorType type, String Value ,String Option){
        driver.element().select(getLocator(type,Value),Option);
    }

    protected void assertElementIsVisible(locatorType type, String value) {
        driver.assertThat()
                .element(getLocator(type,value))
                .isVisible()
                .withCustomReportMessage("Verify that element is visible")
                .perform();
    }
    protected void assertElementsEqual(String Obj1, String Obj2,String Message ){
        Validations
                .assertThat()
                .object(Obj1)
                .isEqualTo(Obj2)
                .withCustomReportMessage(Message)
                .perform();
    }
    public String getURL(){
      return driver.browser().getCurrentURL();
    }

}

package GuiPages;

import com.shaft.driver.SHAFT;

public class PaymentPage extends BasePage{

    public PaymentPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public PaymentPage enterPaymentInfo(String Name,String CardNumber,String CVV,String expirationMonth,String expirationYear){

        enterText(locatorType.CSS,"input[name='name_on_card']", Name);
        enterText(locatorType.CSS,"input[name='card_number']", CardNumber);
        enterText(locatorType.CSS,"input[placeholder='ex. 311']", CVV);
        enterText(locatorType.CSS,"input[placeholder='MM']", expirationMonth);
        enterText(locatorType.CSS,"input[placeholder='YYYY']", expirationYear);
        return this;
    }
    public void clickOnPayButtonAndVerifySuccessMessage(){
        clickElement(locatorType.CSS,"#submit");
    }
    public void assertPaymentPageMessage(){
        assertElementIsVisible(locatorType.CSS,"h2[class='title text-center'] b");
    }
}

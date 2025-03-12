package GuiPages;

import com.shaft.driver.SHAFT;

public class ContactUsFormPage extends BasePage{
    //Constructor
    public ContactUsFormPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public void fillContactUsForm(String Name, String Email, String Subject, String Message){
        enterText(locatorType.CSS,"input[placeholder='Name']",Name);
        enterText(locatorType.CSS,"input[placeholder='Email']",Email);
        enterText(locatorType.CSS,"input[placeholder='Subject']", Subject);
        enterText(locatorType.CSS,"#message", Message);
    }
    public void clickOnSubmitButton(){
        clickElement(locatorType.CSS,"button[type='submit']");
    }
}

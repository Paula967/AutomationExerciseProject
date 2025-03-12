package GuiPages;

import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckoutPage extends BasePage{

    public CheckoutPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    private SHAFT.TestData.JSON MainEmailWithAddressDetailsData =
            new SHAFT.TestData.JSON("src/test/resources/testDataFiles/MainEmailWithAddressDetailsData.json");
    public List<String> getDeliveryAddressData(){

            List<String> returnedData = new ArrayList<>();

            for (int i = 3; i <= 8; i++) {

                String text = getText(locatorType.CSS, "ul[id='address_delivery'] li:nth-child("+i+")");
                if (i == 6) {

                    String[] cityStatePostcode =
                            text.replaceAll("\\s+", " ").trim().split(" ");

                    Collections.addAll(returnedData, cityStatePostcode);

                } else {

                    returnedData.add(text);
                }
            }
        return returnedData;
    }
public void assertDeliveryAddressDetailsAreCorrect( List<String> actualData) {

    List<String> expectedData = List.of(
            MainEmailWithAddressDetailsData.getTestData("Company"),
            MainEmailWithAddressDetailsData.getTestData("Address1"),
            MainEmailWithAddressDetailsData.getTestData("Address2"),
            MainEmailWithAddressDetailsData.getTestData("City"),
            MainEmailWithAddressDetailsData.getTestData("State"),
            String.valueOf(MainEmailWithAddressDetailsData.getTestData("Zipcode")),
            MainEmailWithAddressDetailsData.getTestData("Country"),
            String.valueOf(MainEmailWithAddressDetailsData.getTestData("MobileNumber"))
    );
    for (int i = 0; i < actualData.size(); i++) {
        Validations
                .assertThat()
                .object(expectedData.get(i))
                .equalsIgnoringCaseSensitivity(actualData.get(i))
                .perform();
        }
   }
   public PaymentPage clickOnPlaceOrderButton(){clickElement(locatorType.CSS,".btn.btn-default.check_out");
    return new PaymentPage(driver);}

}

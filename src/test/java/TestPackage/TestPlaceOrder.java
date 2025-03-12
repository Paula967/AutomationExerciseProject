package TestPackage;

import GuiPages.CheckoutPage;
import GuiPages.PaymentPage;
import org.testng.annotations.Test;

import java.util.List;

public class TestPlaceOrder extends BaseClass{

    protected CheckoutPage checkoutPage;
    protected PaymentPage paymentPage;

    @Test(priority = 23)
    public void Verify_that_PlaceOrderLoginBeforeCheckout(){

     checkoutPage =
                 registerUserPage
                .navigateToURL()
                .clickOnSignUpAndLoginButton()
                .loginWithUserNameAndPassword
                        (
                                SignIntestData.getTestData("Email"),
                                SignIntestData.getTestData("Password")
                        )
                .clickOnLoginButton()
                .addProductToCart(1)
                .clickOnViewCartButton()
                .clickOnProceedToCheckOutButton();

    List<String> actualData=
            checkoutPage.getDeliveryAddressData();

    checkoutPage.assertDeliveryAddressDetailsAreCorrect(actualData);

    }
    @Test(priority = 24)
    public void Verify_that_Order_has_been_Placed_Successfully(){
        paymentPage=checkoutPage
                .clickOnPlaceOrderButton()
                .enterPaymentInfo
                        (
                                PaymentTestData.getTestData("Name"),
                                PaymentTestData.getTestData("cardNumber"),
                                String.valueOf(PaymentTestData.getTestData("CVC")),
                                String.valueOf(PaymentTestData.getTestData("expirationMonth")),
                                String.valueOf(PaymentTestData.getTestData("expirationYear"))
                        );

        paymentPage
                .clickOnPayButtonAndVerifySuccessMessage();
        paymentPage
                .assertPaymentPageMessage();
    }
}

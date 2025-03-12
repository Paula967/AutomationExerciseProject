package TestPackage;


import GuiPages.SignUpAndLoginPage;
import org.testng.annotations.Test;

public class TestLoginWithInvalidData extends BaseClass{

    protected SignUpAndLoginPage signUpAndLoginPage;

    @Test(priority = 9)
    public void Verify_that_LoginToYourAccount_is_visible_successfully(){

        signUpAndLoginPage=registerUserPage
                .navigateToURL()
                .clickOnSignUpAndLoginButton()
                .assertSignInHeader();
    }
    @Test(priority = 10)
    public void Verify_that_ErrorYourEmailOrPasswordIsIncorrect_is_visible_successfully(){

        String CorrectPassword=SignIntestData.getTestData("Password");
        String IncorrectPassword=CorrectPassword+"Abcdf";
        signUpAndLoginPage
                .loginWithUserNameAndPassword
                        (
                                SignIntestData.getTestData("Email"),
                                IncorrectPassword
                        )
                .clickOnLoginButton();
                signUpAndLoginPage.assertErrorMessageWithIncorrectLoginData();
    }
}

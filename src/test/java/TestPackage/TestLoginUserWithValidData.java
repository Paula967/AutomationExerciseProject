package TestPackage;

import GuiPages.LoginPage;
import GuiPages.SignUpAndLoginPage;
import org.testng.annotations.Test;
public class TestLoginUserWithValidData extends BaseClass{

    protected SignUpAndLoginPage signUpAndLoginPage;
    protected  LoginPage loginPage;

    @Test(priority = 7)
    public void Verify_that_LoginToYourAccount_is_visible_successfully(){

        signUpAndLoginPage=registerUserPage
                .clickOnSignUpAndLoginButton()
                .assertSignInHeader();
    }
    @Test(priority = 8)
    public void Verify_that_loggedIn_is_visible_successfully(){
         loginPage =signUpAndLoginPage
                .loginWithUserNameAndPassword
                        (
                                   SignIntestData.getTestData("Email"),
                                   SignIntestData.getTestData("Password")
                        )
                .clickOnLoginButton()
                .assertLoggedInUserName();
        loginPage.clickOnLogout();
    }
}

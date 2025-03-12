package TestPackage;

import GuiPages.LoginPage;
import org.testng.annotations.Test;

public class TestLogoutUser extends BaseClass{

    protected LoginPage loginPage;

    @Test(priority = 11)
    public void Verify_that_loggedIn_is_visible_successfully(){

         loginPage =registerUserPage
                 .navigateToURL()
                 .clickOnSignUpAndLoginButton()
                 .loginWithUserNameAndPassword
                        (
                                SignIntestData.getTestData("Email"),
                                SignIntestData.getTestData("Password")
                        )
                .clickOnLoginButton()
                .assertLoggedInUserName()
                .clickOnLogout();
    }
    @Test(priority = 12)
    public void Verify_that_user_is_navigated_toLoginPage(){

        loginPage.assertUserNavigatedToLoginURL(loginPage.getPageURL(),
                URLTestData.getTestData("LoginURL"),"User can not Navigated to Login Page");

    }
}

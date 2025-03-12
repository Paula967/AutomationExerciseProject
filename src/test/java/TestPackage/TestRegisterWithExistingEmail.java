package TestPackage;

import GuiPages.SignUpAndLoginPage;
import org.testng.annotations.Test;

public class TestRegisterWithExistingEmail extends BaseClass{

    protected SignUpAndLoginPage signUpAndLoginPage;

    @Test(priority = 13)
    public void Verify_that_ErrorMessageEmailAlreadyExist_is_visible_successfully(){

        signUpAndLoginPage=registerUserPage
                .navigateToURL()
                        .clickOnSignUpAndLoginButton();
        signUpAndLoginPage.addNewUser
                (
                        SignUptestData.getTestData("name"),
                        SignIntestData.getTestData("Email")
                )
                .clickOnSignUpButton();
        signUpAndLoginPage.assertErrorMessageWithAlreadyRegisteredUser();

    }
}

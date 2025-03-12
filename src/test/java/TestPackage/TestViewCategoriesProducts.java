package TestPackage;

import org.testng.annotations.Test;

public class TestViewCategoriesProducts extends BaseClass{
    @Test(priority = 26)
    public void Verify_that_Category_In_Left_Side_bar(){
        registerUserPage.navigateToURL();
        registerUserPage
                .assertCategoryVisibleInLeftSideBar();
    }
    @Test(priority = 27)
    public void Verify_that_User_Is_Navigated_To_Category_Page(){
        registerUserPage
                .clickOnAnyCategoryUnderWomenCategory()
                .assertCategoryProductPageMessage();
    }
}

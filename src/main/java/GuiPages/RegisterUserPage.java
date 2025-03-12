package GuiPages;

import com.shaft.driver.SHAFT;

public class RegisterUserPage extends BasePage{

    //Constructor
    public RegisterUserPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    //Actions

    /**
     * @return RegisterUserPage
     */
    public RegisterUserPage navigateToURL(){
        driver.browser().navigateToURL("https://automationexercise.com/");
        return new RegisterUserPage(driver);
    }
    /**
     * @return SignUp And login Page
     */
    public SignUpAndLoginPage clickOnSignUpAndLoginButton(){
        clickElement(locatorType.CSS,"a[href='/login']");
        return new SignUpAndLoginPage(driver);
    }

    public void assertHomePageIsVisible(){
        assertElementIsVisible(locatorType.CSS,"div[class='item active'] div[class='col-sm-6'] h2");
    }
    public ContactUsFormPage clickOnContactUsButton(){
        clickElement(locatorType.CSS,"a[href='/contact_us']");
        return new ContactUsFormPage(driver);
    }
    public AllProductsPage clickOnProductsButton(){
        clickElement(locatorType.CSS,"a[href='/products']");
        return new AllProductsPage(driver);
    }
    public RegisterUserPage assertCategoryVisibleInLeftSideBar(){
        assertElementIsVisible(locatorType.XPATH,"//div[@class='left-sidebar']/h2");
        return this;
    }
    public CategoryProductPage clickOnAnyCategoryUnderWomenCategory(){
        clickElement(locatorType.XPATH,"//a[normalize-space()='Women']");
        clickElement(locatorType.XPATH,"//div[@id='Women']//a[contains(text(),'Dress')]");
        return new CategoryProductPage(driver);
    }

    public ProductDetailsPage clickOnViewProductByIndex(int index){
        clickElement(locatorType.XPATH,"(//a[contains(text(),'View Product')])["+index+"]");
        return new ProductDetailsPage(driver);
    }
}

package TestPackage;

import GuiPages.RegisterUserPage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    protected static SHAFT.GUI.WebDriver driver;
    protected SHAFT.TestData.JSON SignIntestData ;
    protected SHAFT.TestData.JSON ProductNametestData ;
    protected SHAFT.TestData.JSON PaymentTestData ;
    protected SHAFT.TestData.JSON SignUptestData ;
    protected SHAFT.TestData.JSON AccountDetailstestData ;
    protected SHAFT.TestData.JSON URLTestData;
    protected RegisterUserPage registerUserPage;


    @BeforeSuite
    public void setup(){
       driver =new SHAFT.GUI.WebDriver();
       driver.browser().navigateToURL("https://automationexercise.com/");
    }
    @BeforeClass
    public void initiate(){
        registerUserPage=new RegisterUserPage(driver);
        SignUptestData=new SHAFT.TestData.JSON("src/test/resources/testDataFiles/SignUpTestData.json");
        SignIntestData=new SHAFT.TestData.JSON("src/test/resources/testDataFiles/SignInTestData.json");
        ProductNametestData=new SHAFT.TestData.JSON("src/test/resources/testDataFiles/ProductName.json");
        PaymentTestData= new SHAFT.TestData.JSON("src/test/resources/testDataFiles/PaymentTestData.json");
        AccountDetailstestData= new SHAFT.TestData.JSON(("src/test/resources/testDataFiles/AccountDetailsTestData.json"));
        URLTestData=new SHAFT.TestData.JSON(("src/test/resources/testDataFiles/URLTestData.json"));
    }
    @AfterSuite
    public void tearDown(){
        if(driver!=null) {
            driver.quit();
        }
    }
}

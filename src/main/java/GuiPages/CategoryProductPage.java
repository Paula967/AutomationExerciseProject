package GuiPages;

import com.shaft.driver.SHAFT;

public class CategoryProductPage extends BasePage{
    public CategoryProductPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public void assertCategoryProductPageMessage(){
        assertElementIsVisible(locatorType.CSS,".title.text-center");
    }
}

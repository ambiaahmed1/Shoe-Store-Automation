package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.BasePage;
import utilities.Driver;

public class MarchPage extends BasePage {

    public MarchPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    public void validateTitle() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Shoe Store: March's Shoes");
    }
}

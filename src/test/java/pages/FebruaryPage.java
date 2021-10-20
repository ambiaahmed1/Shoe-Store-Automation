package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.BasePage;
import utilities.Driver;

public class FebruaryPage extends BasePage {

    public FebruaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void validateTitle() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Shoe Store: February's Shoes");
    }
}

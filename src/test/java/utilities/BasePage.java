package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(linkText = "January")
    private WebElement january;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}

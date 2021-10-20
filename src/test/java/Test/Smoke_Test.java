package Test;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class Smoke_Test extends TestBase {


    @Test(description = "Page verification")
    public void goToShoeStore() {
        report.createTest("Page verification");
        pages.shoePage();
        pages.shoePage().validateTitle();
        pages.shoePage().validateNavComponent();
        pages.shoePage().validateStaticContentOnPage();
    }
}

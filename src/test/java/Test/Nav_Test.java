package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Nav_Test extends TestBase {

    @Test(description = "Validate Page Navigation")
    public void pageNavigation() {
        pages.shoePage();
        pages.shoePage().goToJanuary();
        pages.januaryPage().validateTitle();
        pages.shoePage().goToFebruary();
        pages.februaryPage().validateTitle();
        pages.shoePage().goToMarch();
        pages.marchPage().validateTitle();
        pages.shoePage().goToApril();
        pages.aprilPage().validateTitle();
        pages.shoePage().goToMay();
        pages.mayPage().validateTitle();
    }
}

package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Nav_Test extends TestBase {

    @Test(description = "Validate Page Navigation Across all Pages")
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
        pages.shoePage().goToJune();
        pages.junePage().validateTitle();
        pages.shoePage().goToJuly();
        pages.julyPage().validateTitle();
        pages.shoePage().goToAuguest();
        pages.augustPage().validateTitle();
        pages.shoePage().goToSeptember();
        pages.septemberPage().validateTitle();
        pages.shoePage().goToOctober();
        pages.octoberPage().validateTitle();
        pages.shoePage().goToNovember();
        pages.novemberPage().validateTitle();
        pages.shoePage().goToDecember();
        pages.decemberPage().validateTitle();
        pages.shoePage().goToAllShoes();
        pages.allShoes().validateTitle();
    }


}

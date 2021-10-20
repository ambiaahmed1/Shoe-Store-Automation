package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class PromoCode_Test extends TestBase {

    @Test(description = "Validate Blank Promo Code!")
    public void enter_Blank_Promo() {
        report.createTest("Validate Blank Promo Code!");
        pages.shoePage();
        pages.shoePage().submitPromo();
        pages.shoePage().validatePromoBlank();
    }

    @Test(description = "Validate Invalid Promo Code!")
    public void enter_Invalid_Promo() {
        report.createTest("Validate Invalid Promo Code!");
        pages.shoePage();
        pages.shoePage().enterPromo("xyz");
        pages.shoePage().submitPromo();
        pages.shoePage().validatePromoInvalid();
    }
}

package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class PromoCode_Test extends TestBase {

    @Test(description = "Validate Blank Promo Code!")
    public void enter_Blank_Promo() {
        pages.shoePage();
        pages.shoePage().submitPromo();
        pages.shoePage().validatePromoBlank();
    }

    @Test(description = "Validate Invalid Promo Code!")
    public void enter_Invalid_Promo() {
        pages.shoePage();
        pages.shoePage().enterPromo("xyz");
        pages.shoePage().submitPromo();
        pages.shoePage().validatePromoInvalid();
    }
}

package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Email_Test extends TestBase {

    @Test(description = "Validate Blank Email!")
    public void enter_Blank_Email() {
        pages.shoePage();
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmaiBlank();
    }

    @Test(description = "Validate Email Success!")
    public void enter_Email() {
        pages.shoePage();
        pages.shoePage().enterEmail("test@test.com");
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmailSuccess();
    }

    @Test(description = "Invalidate Email Format Error!")
    public void enter_Invalid_Email() {
        pages.shoePage();
        pages.shoePage().enterEmail("testtest.com");
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmailFailure();
    }
}

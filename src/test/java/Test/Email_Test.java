package Test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Email_Test extends TestBase {

    @Test(description = "Validate Blank Email!")
    public void enter_Blank_Email() {
        report.createTest("Validate Blank Email!");
        pages.shoePage();
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmaiBlank();
    }

    @Test(description = "Validate Email Success!")
    public void enter_Email() {
        report.createTest("Validate Email Success!");
        pages.shoePage();
        pages.shoePage().enterEmail("test@test.com");
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmailSuccess();
    }

    @Test(description = "Invalidate Email Format Error!")
    public void enter_Invalid_Email() {
        report.createTest("Invalidate Email Format Error!");
        pages.shoePage();
        pages.shoePage().enterEmail("testtest.com");
        pages.shoePage().subtmitEmail();
        pages.shoePage().validateEmailFailure();
    }
}

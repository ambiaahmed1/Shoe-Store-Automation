package Test;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ChooseBrand_Test extends TestBase {

    @Test(description = "Select Brand")
    public void select_brand() {
        report.createTest("Select Brand", "Sample Description");
        pages.shoePage();
        pages.shoePage().selectBrand("7 For All Mankind®");
        pages.shoePage().searchBrand();
    }

    @Test(description = "Please Select a Brand")
    public void select_brand_message() {
        report.createTest("Please Select a Brand");
        pages.shoePage();
        pages.shoePage().searchBrand();
        pages.shoePage().selectBrancMessage();
    }

    @Test(description = "Validate Brand Size #254")
    public void validate_total_brands() {
        report.createTest("Validate Brand Size #254");
        pages.shoePage();
        pages.shoePage().validateBrandSize(Integer.valueOf(ConfigurationReader.getProperty("brand_size")));
    }

    @Test(description = "Validate Brand Dropdown content is sorted")
    public void validate_brand_contents_sorted() {
        report.createTest("Validate Brand Dropdown content is sorted");
        pages.shoePage();
        pages.shoePage().validateBrandSorted();
    }

    @Test(description = "Validate Brand Content first letter is lowercase")
    public void validate_brand_contents_letter() {
        report.createTest("Validate Brand Content first letter is lowercase");
        pages.shoePage();
        pages.shoePage().validateforfirstLetter();
    }
}

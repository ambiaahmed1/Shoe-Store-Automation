package Test;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ChooseBrand_Test extends TestBase {

    @Test(description = "Select Brand")
    public void select_brand() {
        pages.shoePage();
        pages.shoePage().selectBrand("7 For All Mankind®");
        pages.shoePage().searchBrand();
    }

    @Test(description = "Select Brand Message")
    public void select_brand_message() {
        pages.shoePage();
        pages.shoePage().searchBrand();
        pages.shoePage().selectBrancMessage();
    }

    @Test(description = "Validate Brand Size #254")
    public void validate_total_brands() {
        pages.shoePage();
        pages.shoePage().validateBrandSize(Integer.valueOf(ConfigurationReader.getProperty("brand_size")));
    }

    @Test(description = "Validate Brand Dropdown content is unsorted")
    public void validate_brand_contents_unsorted() {
        pages.shoePage();
        pages.shoePage().validateBrandUnSorted();
    }

    @Test(description = "Validate Brand Content first letter is lowercase")
    public void validate_brand_contents_letter() {
        pages.shoePage();
        pages.shoePage().validateforfirstLetter();
    }
}

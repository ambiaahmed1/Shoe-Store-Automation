package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShoePage extends BasePage {


    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement home;

    @FindBy(xpath = "//ul//li//a")
    private List<WebElement> months;

    @FindBy(linkText = "January")
    private WebElement january;

    @FindBy(linkText = "February")
    private WebElement february;

    @FindBy(linkText = "March")
    private WebElement march;

    @FindBy(linkText = "April")
    private WebElement april;

    @FindBy(linkText = "May")
    private WebElement may;

    @FindBy(linkText = "June")
    private WebElement june;

    @FindBy(linkText = "July")
    private WebElement july;

    @FindBy(linkText = "August")
    private WebElement august;

    @FindBy(linkText = "September")
    private WebElement september;

    @FindBy(linkText = "October")
    private WebElement october;

    @FindBy(linkText = "November")
    private WebElement november;

    @FindBy(linkText = "December")
    private WebElement december;

    @FindBy(linkText = "All Shoes")
    private WebElement all_shoes;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement e_mail;

    @FindBy(xpath = "//label[contains(text(), 'Promotional Code')]")
    private WebElement promotional_code;


    @FindBy(xpath = "//input[@id='remind_email_submit']")
    private WebElement e_mail_subtmit;

    @FindBy(xpath = "//div[contains(text(), 'Thanks! We will notify you of our new shoes at this email')]")
    private WebElement e_mail_success;

    @FindBy(xpath = "//div[contains(text(), 'Invalid email format. Ex. name@example.com')]")
    private WebElement e_mail_Failure;

    @FindBy(xpath = "//div[contains(text(), 'Please enter an email address')]")
    private WebElement e_mail_Blank;

    @FindBy(id = "brand")
    private WebElement selectBrand;

    @FindBy(id = "search_button")
    private WebElement searchBrand;

    @FindBy(id = "promo_code_input")
    private WebElement promo_code;

    @FindBy(xpath = "//div[contains(text(),'Please enter a promotional code')]")
    private WebElement promo_code_error;

    @FindBy(xpath = "//div[contains(text(),'Invalid code format')]")
    private WebElement promo_invalid_error;

    @FindBy(xpath = "//h2[contains(text(), 'Welcome to Shoe Store!')]")
    private WebElement welcome_to_shoe_store;

    @FindBy(xpath = "//legend[@class='form_heading']")
    private WebElement pre_order;

    @FindBy(xpath = "//label[contains(text(), 'Choose a brand')]")
    private WebElement choose_a_brand;

    @FindBy(xpath = "//label[contains(text(), 'Remind me of new shoes')]")
    private WebElement remind_me;

    @FindBy(xpath = "//input[@type='submit' and @id='remind_email_submit']")
    private WebElement submit;

    @FindBy(id = "promo_code_submit")
    private WebElement promo_submit;

    @FindBy(xpath = "//div[contains(text(),'Please Select a Brand')]")
    private WebElement select_brand_message;

    @FindBy(xpath = "//select[@id='brand']")
    private WebElement brand;


    public ShoePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void validateTitle() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Shoe Store: Welcome to the Shoe Store");
    }

    public void validateStaticContentOnPage() {
        Assert.assertEquals(welcome_to_shoe_store.getText(), "Welcome to Shoe Store!");
        Assert.assertEquals(pre_order.getText(), "Pre-Order your shoes today");
        Assert.assertEquals(choose_a_brand.getText(), "Choose a brand");
        Assert.assertEquals(remind_me.getText(), "Remind me of new shoes");
        Assert.assertEquals(promotional_code.getText(), "Promotional Code");
        submit.isDisplayed();
        promo_code.isDisplayed();
        home.isDisplayed();
        brand.isDisplayed();
    }

    public void validateNavComponent() {
        Iterator<WebElement> month = months.iterator();

        while (month.hasNext()) {
            WebElement element = month.next();
            System.out.println("===========" + element.getText());
            if (element.getText().equals("January")) {
                Assert.assertEquals(element.getText(), "January");
            } else if (element.getText().equals("February")) {
                Assert.assertEquals(element.getText(), "February");
            } else if (element.getText().equals("March")) {
                Assert.assertEquals(element.getText(), "March");
            } else if (element.getText().equals("April")) {
                Assert.assertEquals(element.getText(), "April");
            } else if (element.getText().equals("May")) {
                Assert.assertEquals(element.getText(), "May");
            } else if (element.getText().equals("June")) {
                Assert.assertEquals(element.getText(), "June");
            } else if (element.getText().equals("July")) {
                Assert.assertEquals(element.getText(), "July");
            } else if (element.getText().equals("August")) {
                Assert.assertEquals(element.getText(), "August");
            } else if (element.getText().equals("September")) {
                Assert.assertEquals(element.getText(), "September");
            } else if (element.getText().equals("October")) {
                Assert.assertEquals(element.getText(), "October");
            } else if (element.getText().equals("November")) {
                Assert.assertEquals(element.getText(), "November");
            } else if (element.getText().equals("December")) {
                Assert.assertEquals(element.getText(), "December");
            } else if (element.getText().equals("All Shoes")) {
                Assert.assertEquals(element.getText(), "All Shoes");
            } else {
                Assert.fail();
            }
        }
    }

    public void goToJanuary() {
        january.click();
    }

    public void goToFebruary() {
        february.click();
    }

    public void goToMarch() {
        march.click();
    }

    public void goToApril() {
        april.click();
    }

    public void goToMay() {
        may.click();
    }

    public void goToJune() {
        june.click();
    }

    public void goToJuly() {
        july.click();
    }

    public void goToAuguest() {
        august.click();
    }

    public void goToSeptember() {
        september.click();
    }

    public void goToOctober() {
        october.click();
    }

    public void goToNovember() {
        november.click();
    }

    public void goToDecember() {
        december.click();
    }

    public void goToAllShoes() {
        all_shoes.click();
    }

    public void goBack() {
        Driver.getDriver().navigate().back();
    }

    public void enterEmail(String address) {
        e_mail.click();
        e_mail.sendKeys(address);
    }

    public void subtmitEmail() {
        e_mail_subtmit.click();
    }

    public void validateEmailSuccess() {
        Assert.assertEquals(e_mail_success.getText().contains("Thanks! We will notify you of our new shoes at this email"), true);
    }

    public void validateEmailFailure() {
        Assert.assertEquals(e_mail_Failure.getText(), ("Invalid email format. Ex. name@example.com"));
    }

    public void validateEmaiBlank() {
        Assert.assertEquals(e_mail_Blank.getText(), "Please enter an email address");
    }

    public void validatePromoBlank() {
        Assert.assertEquals(promo_code_error.getText(), "Please enter a promotional code");
    }

    public void validatePromoInvalid() {
        Assert.assertEquals(promo_invalid_error.getText(), "Invalid code format");
    }

    public void submitPromo() {
        promo_submit.click();
    }

    public void enterPromo(String promo) {
        promo_code.sendKeys(promo);
    }

    public void selectBrand(String visibleText) {
        Select brands = new Select(selectBrand);
        brands.selectByVisibleText(visibleText);
    }

    public void selectBrancMessage() {
        Assert.assertEquals(select_brand_message.getText(), "Please Select a Brand");
    }


    public void searchBrand() {
        searchBrand.click();
    }

    public void validateBrandSize(int value) {
        Select dropDown = new Select(selectBrand);
        List<WebElement> dropDownOptions = dropDown.getOptions();
        Assert.assertEquals(dropDownOptions.size(), value);
    }

    public void validateBrandUnSorted() {
        Select dropDown = new Select(selectBrand);
        List<WebElement> dropDownOptions = dropDown.getOptions();
        List<String> options = new ArrayList<String>();

        for (WebElement dropDownOption : dropDownOptions) {
            options.add(dropDownOption.getText());
        }
        options.remove("Select Brand");
        List<String> tempList = new ArrayList<String>(options);
        Collections.sort(tempList);
        boolean ifSortedAscending = options.equals(tempList);

        Assert.assertEquals(ifSortedAscending, false);
    }

    public void validateforfirstLetter() {
        Select dropDown = new Select(selectBrand);
        List<WebElement> dropDownOptions = dropDown.getOptions();

        int lowercase = 0;
        int uppercase = 0;
        ArrayList<String> arr = new ArrayList<String>();
        for (WebElement dropDownOption : dropDownOptions) {
            //System.out.println(dropDownOption.getText());
            char[] charArr = dropDownOption.getText().toCharArray();
            char firstLetter = charArr[0];

            boolean lower = Character.isLowerCase(firstLetter);
            boolean upper = Character.isLowerCase(firstLetter);
            if (lower) {
                ++lowercase;
                arr.add(dropDownOption.getText());
                System.out.println(dropDownOption.getText());
            } else {
                ++uppercase;
            }
        }
        System.out.println("Total letters start with Uppercase: " + uppercase);
        System.out.println("Total letters start with Lowercase: " + lowercase + " " + arr);
    }


    public void validateBrands() {
        Select dropDown = new Select(selectBrand);
        List<WebElement> dropDownOptions = dropDown.getOptions();

        String allBrands = ConfigurationReader.getProperty("allbrands");
        //String[] brands = allBrands.split(",");

        String[] actual = new String[dropDownOptions.size()];

        for (int i = 0; i < dropDownOptions.size(); i++) {
            // actual[i] = dropDownOptions.get(i);
        }

        System.out.println(allBrands);
        System.out.println(actual);
    }
}


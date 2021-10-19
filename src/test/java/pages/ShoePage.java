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

    @FindBy(xpath = "//input[@name='email']")
    private WebElement e_mail;

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


    @FindBy(id = "promo_code_submit")
    private WebElement promo_submit;

    @FindBy(xpath = "//div[contains(text(),'Please Select a Brand')]")
    private WebElement select_brand_message;


    public ShoePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void validateTitle() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Shoe Store: Welcome to the Shoe Store");
    }

    public void validateStaticContentOnPage() {
        Assert.assertEquals(home.getText(), "HOME");
        Assert.assertEquals(january.getText(), "January");
        Assert.assertEquals(february.getText(), "February");
        Assert.assertEquals(march.getText(), "March");

    }

    public void validateNavComponent() {
        Iterator<WebElement> month = months.iterator();

        while (month.hasNext()) {
            WebElement element = month.next();
            System.out.println("===========" +element.getText());
            if (element.getText().equals("January")) {
                Assert.assertEquals(element.getText(), "January");
            } else if(element.getText().equals("February")) {
                Assert.assertEquals(element.getText(), "February");
            } else if(element.getText().equals("March")) {
                Assert.assertEquals(element.getText(), "March");
            } else if(element.getText().equals("April")) {
                Assert.assertEquals(element.getText(), "April");
            } else if(element.getText().equals("May")) {
                Assert.assertEquals(element.getText(), "May");
            } else if(element.getText().equals("June")) {
                Assert.assertEquals(element.getText(), "June");
            }  else if(element.getText().equals("July")) {
                Assert.assertEquals(element.getText(), "July");
            }  else if(element.getText().equals("August")) {
                    Assert.assertEquals(element.getText(), "August");
            }  else if(element.getText().equals("September")) {
                Assert.assertEquals(element.getText(), "September");
            }  else if(element.getText().equals("October")) {
                Assert.assertEquals(element.getText(), "October");
            }  else if(element.getText().equals("November")) {
                Assert.assertEquals(element.getText(), "November");
            }  else if(element.getText().equals("December")) {
                Assert.assertEquals(element.getText(), "December");
            }  else if(element.getText().equals("All Shoes")) {
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

     /*   for(int i =0; i<brands.length; i++) {
            actual[i] = dropDownOptions.get(i).getText();

            Assert.assertEquals(Arrays.asList(actual[i]), brands[i].replace("\"",""));
            System.out.println("Actual " +  actual[i]);
            System.out.println("Expected " +  brands[i]);
        }
*/


     /*   for(int i =0; i<elementCount.size(); i++) {
            String optionValue = elementCount.get(i).getText();
           // System.out.println(optionValue);

        }*/

    }


}


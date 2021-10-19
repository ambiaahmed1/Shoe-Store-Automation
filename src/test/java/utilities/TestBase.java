package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class TestBase {

    protected WebDriver driver;
    protected Pages pages;
    protected SoftAssert softAssert;

    @BeforeSuite(alwaysRun = true)
    @Parameters("browser")
    public void setUpTest(@Optional String browser) {

    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setup(@Optional String browser) {
        driver = Driver.getDriver(browser);
        pages = new Pages();
        softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        String url = ConfigurationReader.getProperty("environment");
        System.out.println(url);
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    @Parameters("browser")
    public void teardown(@Optional String browser, ITestResult result) {
        Driver.closeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownTest() {
    }

}

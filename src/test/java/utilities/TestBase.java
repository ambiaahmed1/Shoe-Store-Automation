package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;


public class TestBase {

    protected WebDriver driver;
    protected Pages pages;
    protected SoftAssert softAssert;
    protected static ExtentReports report;
    public static ExtentTest extentLogger;
    protected static ExtentHtmlReporter htmlReporter;

    @BeforeSuite(alwaysRun = true)
    @Parameters("test")
    public void setUpTest(@Optional String test) {
        report = new ExtentReports();
        if (test == null) {
            test = "reports";
        }
        String filePath = System.getProperty("user.dir") + "/test-output/" + test + "/" + LocalDate.now().format(DateTimeFormatter.ofPattern("MM_dd_yyyy")) + "/report.html";
        htmlReporter = new ExtentHtmlReporter(filePath);
        report.attachReporter(htmlReporter);
        report.setSystemInfo("ENV", ConfigurationReader.getProperty("environment"));
        report.setSystemInfo("browser", ConfigurationReader.getProperty("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        htmlReporter.config().setDocumentTitle("Test automation");
        htmlReporter.config().setReportName("Test automation");
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
    public void teardown() {
        Driver.closeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownTest() {
        report.flush();
    }

}

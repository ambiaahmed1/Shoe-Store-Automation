package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;


    private Driver() {
    }

    public synchronized static WebDriver getDriver(String browser) {
        if (driver == null) {

            browser = (browser == null) ? ConfigurationReader.getProperty("browser") : browser;

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                default:
                    throw new RuntimeException("Illegal browser type!");
            }
        }
        return driver;
    }

    public static WebDriver getDriver() {

        return getDriver(null);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

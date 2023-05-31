package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

/**
 * Singleton
 */
public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "mac_chrome":
                    System.setProperty("webdriver.chrome.driver", "/Users/alboniushko/IdeaProjects/udemi_selenium/src/main/resources/chromedriver");
                    driver = new ChromeDriver();
                default:
                    Assert.fail("Incorrect OS or browser: " + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        }
        return driver;
    }
}

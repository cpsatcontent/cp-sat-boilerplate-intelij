package com.ata.cpsat.boilerplate;

import com.ata.cpsat.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * Class to manage {@link WebDriver}
 *
 * @author Hitesh Prajapati
 * @version %I%, %G%
 * @since 1.0
 */
public class DriverFactory {

    private static final Logger logger = LogManager.getLogger(DriverFactory.class.getName());
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        if (driver.get() != null) {
            return driver.get();
        } else {
            throw new NullPointerException("Please initialize driver before calling getDriver Method");
        }
    }

    /**
     * To download binary for the browser specified as parameter
     * and create instance of it
     *
     * @param browser Browser to initialize of type <code>Browser</code>
     * @return <code>DriverFactory</code>
     */
    public DriverFactory initBrowser(Browser browser) {
        switch (browser) {
            case IE:
                WebDriverManager.iedriver().setup();
                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
                ieOptions.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                ieOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                driver.set(new InternetExplorerDriver());
                break;
            case Edge:
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());
                break;
            case Firefox:
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            case Chromium:
                WebDriverManager.chromiumdriver().setup();
                driver.set(new ChromeDriver());
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
        }

        // Maximize browser
        getDriver().manage().window().maximize();
        return this;
    }


    /**
     * To set the Web Url.
     *
     * @param webUrl Web Url of Application
     */
    public void setUrl(String webUrl) {
        getDriver().get(webUrl);
    }

    /**
     * To close the browser and clean the driver service.
     */
    public void closeBrowser() {
        try {
            if (getDriver() != null) {
                getDriver().close();
                if (getDriver() instanceof ChromeDriver) {
                    getDriver().quit();
                }
            }
        } catch (WebDriverException ex) {
            logger.error(ex.getMessage(), ex);
        }

        // set value to null
        driver.remove();
    }
}

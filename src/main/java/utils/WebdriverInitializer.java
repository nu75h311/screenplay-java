package utils;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverInitializer {
    static Logger logger = LogManager.getLogger("WebdriverInitializer");

    public static WebDriver getDriverFor(String browserType) {
        loadConfigFile();
        WebDriver driver;
        switch (browserType) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static void loadConfigFile() {
        try (InputStream propFile = WebdriverInitializer.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties props = new Properties();

            if (propFile == null) {
                logger.warn("Sorry, unable to find config.properties");
                return;
            }

            props.load(propFile);
            props.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));

        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}

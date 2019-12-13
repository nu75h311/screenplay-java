package pageobjects.pages;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;
import static utils.WebdriverInitializer.getDriverFor;

import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public void openBrowser() {
        driver = getDriverFor(FIREFOX);
    }

    public WebDriver browser() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }
}

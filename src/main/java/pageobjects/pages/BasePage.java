package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    private WebDriver driver;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public WebDriver browser() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }
}

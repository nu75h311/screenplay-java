package screenplay.actors;

import org.openqa.selenium.WebDriver;

import screenplay.models.Actor;

public class WebSurfer extends Actor {

    private WebDriver driver;

    public WebSurfer(final String called) {
        super(called);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(final WebDriver driver) {
        this.driver = driver;
    }

    public void cleanUp() {
        driver.quit();
    }
}

package screenplay.models;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;
import static utils.WebdriverInitializer.getDriverFor;

import org.openqa.selenium.WebDriver;

public class Actor {

    private String name;
    private WebDriver driver;

    public Actor(String called) {
        name = called;
    }

    public Actor whoSurfsWithFirefox() {
        driver = getDriverFor(FIREFOX);
        return this;
    }

    public Actor whoSurfsWithChrome() {
        driver = getDriverFor(CHROME);
        return this;
    }

    public void wasAbleTo(Task task) {
        perform(task);
    }

    public void attemptsTo(Task task) {
        perform(task);
    }

    public void shouldSeeThat(Question question) {
        ask(question);
    }

    public void closesTheBrowser() {
        driver.quit();
    }

    private void ask(Question question) {
        question.ask(driver, name);
    }

    private void perform(Task task) {
        task.perform(driver, name);
    }

}

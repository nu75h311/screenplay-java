package screenplay.models;

import static screenplay.models.WebdriverFinder.loadConfigFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actor {

    private String name;
    private WebDriver driver;

    public Actor(String called) {
        name = called;
    }

    public Actor whoSurfsWithFirefox() {
        loadConfigFile();
        driver = new FirefoxDriver();
        maximizeWindow();
        return this;
    }

    public Actor whoSurfsWithChrome() {
        loadConfigFile();
        driver = new ChromeDriver();
        maximizeWindow();
        return this;
    }

    public void wasAbleTo(Task task) {
        perform(task);
    }

    public void attemptsTo(Task task) {
        perform(task);
    }

    public void shouldSee(Question question) {
        ask(question);
    }

    private void ask(Question question) {
        question.ask(driver);
    }

    private void perform(final Task task) {
        task.perform(driver);
    }

    private void maximizeWindow() {
        driver.manage().window().maximize();
    }
}

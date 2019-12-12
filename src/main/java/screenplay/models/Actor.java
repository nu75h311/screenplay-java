package screenplay.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actor {

    private String name;
    private WebDriver driver;

    public Actor(String called) {
        name = called;

        System.setProperty("webdriver.chrome.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
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
}

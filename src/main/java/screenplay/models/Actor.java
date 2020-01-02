package screenplay.models;

import org.openqa.selenium.WebDriver;

import io.restassured.response.Response;

public class Actor {

    private String name;
    private WebDriver driver;
    private Response response;

    public Actor(String called) {
        name = called;
    }

    public String name() {
        return name;
    }

    public Actor whoCan(Ability ability) {
        acquire(ability);
        return this;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Actor whoMakesApiCalls() {
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

    private void acquire(Ability ability) {
        ability.acquire(this);
    }

    private void ask(Question question) {
        question.ask(driver, this);
    }

    private void perform(Task task) {
        task.perform(driver, this);
    }

}

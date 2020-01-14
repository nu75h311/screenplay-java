package none;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NP_AddTodoTests {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void the_worst_test_of_all_time_just_kidding_only_within_this_project_test() {
        driver.get("http://todomvc.com/examples/vanillajs/");

        driver.findElement(By.className("new-todo"))
              .sendKeys("Feed the cat", Keys.ENTER);

        List<String> todos = new ArrayList<>();
        driver.findElements(By.cssSelector(".todo-list li"))
              .forEach(item -> todos.add(item.getText()));

        assertThat(todos, hasSize(1));
        assertThat(todos, contains("Feed the cat"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

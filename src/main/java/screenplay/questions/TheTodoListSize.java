package screenplay.questions;

import static org.assertj.core.api.Assertions.assertThat;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import screenplay.models.Question;

public class TheTodoListSize implements Question {

    int expectedSize;

    public TheTodoListSize is(int expectedSize) {
        this.expectedSize = expectedSize;
        return this;
    }

    @Override
    public void ask(final WebDriver driver, final String actorName) {
        List<String> todos = new ArrayList<>();
        driver.findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos.size()).isEqualTo(expectedSize);
        logger.info("{} saw that the list size is {}", actorName, expectedSize);
    }
}

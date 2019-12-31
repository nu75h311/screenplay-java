package screenplay.questions;

import static org.assertj.core.api.Assertions.assertThat;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import screenplay.models.Actor;
import screenplay.models.Question;

class TheTodoListSize implements Question {

    int expectedSize;

    TheTodoListSize(int expectedSize) {
        this.expectedSize = expectedSize;
    }

    @Override
    public void ask(final WebDriver driver, final Actor actor) {
        List<String> todos = new ArrayList<>();
        driver.findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos.size()).isEqualTo(expectedSize);
        logger.info(() -> actor.name() + " saw that the list size is " + expectedSize);
    }
}

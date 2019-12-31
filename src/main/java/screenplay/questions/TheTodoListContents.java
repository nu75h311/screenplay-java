package screenplay.questions;

import static org.assertj.core.api.Assertions.assertThat;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import screenplay.models.Actor;
import screenplay.models.Question;

class TheTodoListContents implements Question {

    String[] todoItems;

    TheTodoListContents(String... todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public void ask(final WebDriver driver, final Actor actor) {
        List<String> todos = new ArrayList<>();
        driver.findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos).contains(todoItems);
        logger.info(() -> actor.name() + " saw that the list contains " + Arrays.toString(todoItems));
    }
}

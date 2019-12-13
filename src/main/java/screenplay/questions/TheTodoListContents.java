package screenplay.questions;

import static org.assertj.core.api.Assertions.assertThat;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import screenplay.models.Question;

public class TheTodoListContents implements Question {

    String[] todoItems;

    public TheTodoListContents have(String... todoItems) {
        this.todoItems = todoItems;
        return this;
    }

    @Override
    public void ask(final WebDriver driver, final String actorName) {
        List<String> todos = new ArrayList<>();
        driver.findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos).contains(todoItems);
        logger.info("{} saw that the list contains {}", actorName, todoItems);
    }
}

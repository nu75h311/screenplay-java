package screenplay.questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import screenplay.actors.WebSurfer;
import screenplay.models.Question;

class TheTodoListContents implements Question<WebSurfer> {

    String[] todoItems;

    TheTodoListContents(String... todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public void ask(final WebSurfer actor) {
        List<String> todos = new ArrayList<>();
        actor.getDriver().findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos, hasItems(todoItems));
        logger.info(() -> actor.name() + " saw that the list contains " + Arrays.toString(todoItems));
    }
}

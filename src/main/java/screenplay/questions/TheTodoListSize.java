package screenplay.questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static screenplay.pages.TodoMvcPageElements.TODO_LIST;

import java.util.ArrayList;
import java.util.List;

import screenplay.actors.WebSurfer;
import screenplay.models.Question;

class TheTodoListSize implements Question<WebSurfer> {

    int expectedSize;

    TheTodoListSize(int expectedSize) {
        this.expectedSize = expectedSize;
    }

    @Override
    public void ask(final WebSurfer actor) {
        List<String> todos = new ArrayList<>();
        actor.getDriver().findElements(TODO_LIST.locator()).forEach(item -> todos.add(item.getText()));
        assertThat(todos.size(), equalTo(expectedSize));
        logger.info(() -> actor.name() + " saw that the list size is " + expectedSize);
    }
}

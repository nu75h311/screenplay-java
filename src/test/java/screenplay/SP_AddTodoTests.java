package screenplay;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import screenplay.models.Actor;
import screenplay.questions.TheTodoList;
import screenplay.tasks.AddATodoItem;
import screenplay.tasks.Start;

public class SP_AddTodoTests {

    Actor alice = new Actor("Alice").whoSurfsWithFirefox();

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        alice.wasAbleTo(Start.withAnEmptyList());
        alice.attemptsTo(AddATodoItem.called("Feed the cat"));
        alice.shouldSeeThat(TheTodoList.size().is(1));
        alice.shouldSeeThat(TheTodoList.contents().have("Feed the cat"));
    }

    @AfterEach
    private void tearDown() {
        alice.closesTheBrowser();
    }

}

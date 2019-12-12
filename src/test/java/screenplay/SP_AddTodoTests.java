package screenplay;

import org.junit.jupiter.api.Test;

import screenplay.models.Actor;
import screenplay.tasks.Start;

public class SP_AddTodoTests {

    Actor alice = new Actor("Alice");

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        alice.wasAbleTo(Start.withAnEmptyList());
    }

}

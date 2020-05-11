package screenplay;

import static org.openqa.selenium.remote.BrowserType.CHROME;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import screenplay.abilities.SurfTheWeb;
import screenplay.actors.WebSurfer;
import screenplay.models.Actor;
import screenplay.questions.TheTodoList;
import screenplay.tasks.AddATodoItem;
import screenplay.tasks.Start;

public class SP_AddTodoTests {

    Actor alice = new WebSurfer("Alice").whoCan(SurfTheWeb.with(CHROME));

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        alice.wasAbleTo(Start.withAnEmptyList());
        alice.attemptsTo(AddATodoItem.called("Feed the cat"));
        alice.shouldSeeThat(TheTodoList.sizeIs(1));
        alice.shouldSeeThat(TheTodoList.contentsHave("Feed the cat"));
    }

    @Test
    public void should_be_able_to_add_additional_todo_items() {
        alice.wasAbleTo(Start.withAListContaining("Feed the cat",
                "Take out the garbage"));
        alice.attemptsTo(AddATodoItem.called("Walk the dog"));
        alice.shouldSeeThat(TheTodoList.sizeIs(3));
        alice.shouldSeeThat(TheTodoList.contentsHave("Feed the cat",
                "Take out the garbage",
                "Walk the dog"));
    }

    @AfterEach
    private void tearDown() {
        alice.cleanUp();
    }

}

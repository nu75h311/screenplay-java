package cucumber.steps;

import static screenplay.models.Cast.theActorCalled;

import io.cucumber.java8.En;
import screenplay.models.Actor;
import screenplay.models.Cast;
import screenplay.questions.TheTodoList;
import screenplay.tasks.AddATodoItem;
import screenplay.tasks.Start;

public class StartStepDefinitions implements En {

    Cast cast;

    public StartStepDefinitions() {

        Before(() -> cast = new Cast());

        Given("{web_surfer} was able to start with an empty list", (Actor actor) -> {
            cast.hasANew(actor);
            theActorCalled(actor.name()).wasAbleTo(Start.withAnEmptyList());
        });

        When("{word} attempts to add a todo item called {string}", (String actorName, String todoItem) -> {
            theActorCalled(actorName).attemptsTo(AddATodoItem.called(todoItem));
        });

        Then("{word} should see that the todo list contains only {string}", (String actorName, String todoItem) -> {
            theActorCalled(actorName).shouldSeeThat(TheTodoList.sizeIs(1));
            theActorCalled(actorName).shouldSeeThat(TheTodoList.contentsHave(todoItem));
            theActorCalled(actorName).closesTheBrowser();
        });

        // TODO: clean up at Cast level.
        // After(() -> cast.closesAllBrowsers);
    }
}

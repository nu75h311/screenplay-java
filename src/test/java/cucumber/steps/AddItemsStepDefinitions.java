package cucumber.steps;

import static screenplay.models.Cast.theActorCalled;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java8.En;
import screenplay.models.Cast;
import screenplay.tasks.AddATodoItem;

public class AddItemsStepDefinitions implements En {

    @Autowired
    Cast cast;

    public AddItemsStepDefinitions() {

        When("{word} attempts to add a todo item called {string}", (String actorName, String todoItem) -> {
            theActorCalled(actorName).attemptsTo(AddATodoItem.called(todoItem));
        });
    }
}

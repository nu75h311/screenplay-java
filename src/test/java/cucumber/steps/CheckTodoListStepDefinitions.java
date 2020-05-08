package cucumber.steps;

import static screenplay.models.Cast.theActorCalled;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java8.En;
import screenplay.models.Actor;
import screenplay.models.Cast;
import screenplay.questions.TheTodoList;
import screenplay.tasks.Start;

public class CheckTodoListStepDefinitions implements En {

    @Autowired
    Cast cast;

    public CheckTodoListStepDefinitions() {

        Then("{word} should see that the todo list contains only {string}", (String actorName, String todoItem) -> {
            theActorCalled(actorName).shouldSeeThat(TheTodoList.sizeIs(1));
            theActorCalled(actorName).shouldSeeThat(TheTodoList.contentsHave(todoItem));
        });
    }
}

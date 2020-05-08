package cucumber.steps;

import static screenplay.models.Cast.theActorCalled;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java8.En;
import screenplay.models.Actor;
import screenplay.models.Cast;
import screenplay.questions.TheTodoList;
import screenplay.tasks.Start;

public class StartStepDefinitions implements En {

    @Autowired
    Cast cast;

    public StartStepDefinitions() {

        Given("{web_surfer} was able to start with an empty list", (Actor actor) -> {
            cast.hasANew(actor);
            theActorCalled(actor.name()).wasAbleTo(Start.withAnEmptyList());
        });
    }
}

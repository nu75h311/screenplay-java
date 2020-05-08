package screenplay.models;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class Cast {

    private static List<Actor> castOfActors = new ArrayList<>();

    public static Actor theActorCalled(String name) {
        return castOfActors.stream().filter(actor -> name.equals(actor.name())).findAny()
                           .orElseThrow(() -> new ScreenplayException("There is no actor named '" + name + "' in the cast."));
    }

    public void hasANew(final Actor actor) {
        castOfActors.add(actor);
    }

    public void closesAllBrowsers() {
        castOfActors.forEach(Actor::closesTheBrowser);
    }
}

package screenplay.models;

import java.util.ArrayList;
import java.util.List;

public class Cast {

    private static List<Actor> cast = new ArrayList<>();

    public void hasANew(final Actor actor) {
        cast.add(actor);
    }

    public static Actor theActorCalled(String name) {
        return cast.stream().filter(actor -> name.equals(actor.name())).findAny()
                .orElseThrow(() -> new ScreenplayException("There is no actor named '" + name + "' in the cast."));
    }

    public void closesAllBrowsers() {
        cast.forEach(Actor::closesTheBrowser);
    }
}

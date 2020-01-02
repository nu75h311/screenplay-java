package screenplay.abilities;

import screenplay.models.Ability;
import screenplay.models.Actor;

public class MakeApiCalls implements Ability {

    String apiBaseUrl;

    MakeApiCalls(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public static MakeApiCalls at(final String apiBaseUrl) {
        return new MakeApiCalls(apiBaseUrl);
    }

    @Override
    public void acquire(Actor actor) {
        actor.setApiBaseUrl(apiBaseUrl);
        logger.info(() -> actor.name() + " can make API calls at " + apiBaseUrl);
    }
}

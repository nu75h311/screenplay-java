package screenplay.abilities;

import screenplay.actors.ApiClient;
import screenplay.models.Ability;

public class MakeApiCalls implements Ability<ApiClient> {

    String apiBaseUrl;

    MakeApiCalls(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public static MakeApiCalls at(final String apiBaseUrl) {
        return new MakeApiCalls(apiBaseUrl);
    }

    @Override
    public void acquire(ApiClient actor) {
        actor.setApiBaseUrl(apiBaseUrl);
        logger.info(() -> actor.name() + " can make API calls at " + apiBaseUrl);
    }
}

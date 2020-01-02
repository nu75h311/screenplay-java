package screenplay.abilities;

import static utils.WebdriverInitializer.getDriverFor;

import screenplay.models.Ability;
import screenplay.models.Actor;

public class SurfTheWeb implements Ability {

    String browserType;

    SurfTheWeb(String browserType) {
        this.browserType = browserType;
    }

    public static SurfTheWeb with(final String browserType) {
        return new SurfTheWeb(browserType);
    }

    @Override
    public void acquire(Actor actor) {
        actor.setDriver(getDriverFor(browserType));
        logger.info(() -> actor.name() + " can surf the web with " + browserType);
    }
}

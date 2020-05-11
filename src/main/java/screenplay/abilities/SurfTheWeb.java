package screenplay.abilities;

import static utils.WebdriverInitializer.getDriverFor;

import screenplay.actors.WebSurfer;
import screenplay.models.Ability;

public class SurfTheWeb implements Ability<WebSurfer> {

    String browserType;

    SurfTheWeb(String browserType) {
        this.browserType = browserType;
    }

    public static SurfTheWeb with(final String browserType) {
        return new SurfTheWeb(browserType);
    }

    @Override
    public void acquire(WebSurfer actor) {
        actor.setDriver(getDriverFor(browserType));
        logger.info(() -> actor.name() + " can surf the web with " + browserType);
    }
}

package screenplay.questions;

import static org.hamcrest.Matchers.hasItems;

import java.util.Arrays;

import screenplay.actors.ApiClient;
import screenplay.models.Question;

public class TheBandMembers implements Question<ApiClient> {

    String[] expectedNames;

    TheBandMembers(String... expectedNames) {
        this.expectedNames = expectedNames;
    }

    public static TheBandMembers namesContain(String... expectedNames) {
        return new TheBandMembers(expectedNames);
    }

    @Override
    public void ask(final ApiClient actor) {
        actor.getResponse().then().body("relations.artist.name", hasItems(expectedNames));
        logger.info(() -> actor.name() + " saw that the band members list contains " + Arrays.toString(expectedNames));
    }
}

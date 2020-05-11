package screenplay.tasks;

import static io.restassured.RestAssured.get;

import screenplay.actors.ApiClient;
import screenplay.models.Task;
import screenplay.pages.MusicbrainzIds;

public class GetDetails implements Task<ApiClient> {

    MusicbrainzIds artistName;

    GetDetails(MusicbrainzIds artistName) {
        this.artistName = artistName;
    }

    public static GetDetails fromArtist(final MusicbrainzIds artistName) {
        return new GetDetails(artistName);
    }

    @Override
    public void perform(final ApiClient actor) {
        String apiQuery = actor.getApiBaseUrl() + "/artist/" + artistName.id() + "?inc=artist-rels&fmt=json";
        actor.setResponse(get(apiQuery));
        logger.info(() -> actor.name() + " got details from band " + artistName + "(" + apiQuery + ")");
    }
}

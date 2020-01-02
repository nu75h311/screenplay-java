package screenplay;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasItems;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

public class SP_CheckBandMembersTests {

    @Test
    public void should_be_able_to_check_us_bands() {
        Response res = get("http://musicbrainz.org/ws/2/artist/5b11f4ce-a62d-471e-81fc-a69a8278c7da?inc=artist-rels&fmt=json");
        res.then().body("relations.artist.name", hasItems("Dave Grohl", "Krist Novoselic", "Kurt Cobain"));
    }

}

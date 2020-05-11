package screenplay;

import static screenplay.pages.MusicbrainzIds.NIRVANA;
import static screenplay.pages.MusicbrainzIds.RUSH;

import org.junit.jupiter.api.Test;

import screenplay.abilities.MakeApiCalls;
import screenplay.actors.ApiClient;
import screenplay.models.Actor;
import screenplay.questions.TheBandMembers;
import screenplay.tasks.GetDetails;

public class SP_CheckBandMembersTests {

    private static final String MUSICBRAINZ_BASE_URL = "http://musicbrainz.org/ws/2";

    Actor spotify = new ApiClient("Spotify").whoCan(MakeApiCalls.at(MUSICBRAINZ_BASE_URL));

    @Test
    public void should_be_able_to_check_american_bands() {
        spotify.attemptsTo(GetDetails.fromArtist(NIRVANA));
        spotify.shouldSeeThat(TheBandMembers.namesContain("Dave Grohl",
                                                          "Krist Novoselic",
                                                          "Kurt Cobain"));
    }

    @Test
    public void should_be_able_to_check_canadian_bands() {
        spotify.attemptsTo(GetDetails.fromArtist(RUSH));
        spotify.shouldSeeThat(TheBandMembers.namesContain("Alex Lifeson",
                                                          "Geddy Lee",
                                                          "Neil Peart"));
    }

}

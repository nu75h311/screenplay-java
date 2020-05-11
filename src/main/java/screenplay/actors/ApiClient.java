package screenplay.actors;

import io.restassured.response.Response;
import screenplay.models.Actor;

public class ApiClient extends Actor {

    private String apiBaseUrl;
    private Response response;

    public ApiClient(final String called) {
        super(called);
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(final Response response) {
        this.response = response;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public void cleanUp() {
        // There is nothing for this actor to clean up.
    }
}

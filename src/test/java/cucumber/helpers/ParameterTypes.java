package cucumber.helpers;

import static org.openqa.selenium.remote.BrowserType.CHROME;

import io.cucumber.java8.En;
import screenplay.abilities.SurfTheWeb;
import screenplay.models.Actor;

public class ParameterTypes implements En {

    public ParameterTypes() {
        ParameterType("web_surfer", "([a-zA-Z]+)", (String name) ->
                new Actor(name).whoCan(SurfTheWeb.with(CHROME)));
    }
}

package cucumber.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.helpers.SpringConfig;
import io.cucumber.java8.En;
import io.cucumber.spring.CucumberContextConfiguration;
import screenplay.models.Cast;

@CucumberContextConfiguration
@ContextConfiguration(classes = SpringConfig.class)
public class Hooks implements En {

    @Autowired
    Cast cast;

    public Hooks() {

        Before(() -> cast = new Cast());

        After(() -> cast.closesAllBrowsers());
    }
}

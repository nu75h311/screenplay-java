package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public interface Question {
    Logger logger = LogManager.getLogger("QUESTION");

    void ask(WebDriver driver, Actor actor);
}

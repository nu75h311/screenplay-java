package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Question<T extends Actor> {
    Logger logger = LogManager.getLogger("QUESTION");

    void ask(T actor);
}

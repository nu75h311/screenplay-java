package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Task<T extends Actor> {
    Logger logger = LogManager.getLogger("TASK    ");

    void perform(T actor);
}

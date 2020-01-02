package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Ability {
    Logger logger = LogManager.getLogger("ABILITY ");

    void acquire(Actor actor);
}

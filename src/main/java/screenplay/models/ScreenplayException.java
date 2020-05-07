package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScreenplayException extends RuntimeException {
    Logger logger = LogManager.getLogger("SCRNPLY ");

    public ScreenplayException(final String message) {
        logger.error(message);
    }
}

package screenplay.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public interface Task {
    Logger logger = LogManager.getLogger("TASK");

    void perform(WebDriver driver, String actorName);
}

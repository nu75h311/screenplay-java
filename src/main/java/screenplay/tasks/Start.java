package screenplay.tasks;

import org.openqa.selenium.WebDriver;

import screenplay.models.Task;

public class Start implements Task {

    public static Start withAnEmptyList() {
        return new Start();
    }

    @Override
    public void perform(WebDriver driver, String actorName) {
        driver.get("http://todomvc.com/examples/vanillajs/");
        logger.info("{} started with an empty todo list.", actorName);
    }
}

package screenplay.tasks;

import org.openqa.selenium.WebDriver;

import screenplay.models.Task;

public class Start implements Task {

    public static Start withAnEmptyList() {
        return new Start();
    }

    @Override
    public void perform(WebDriver driver) {
        driver.get("http://todomvc.com/examples/vanillajs/");
    }
}

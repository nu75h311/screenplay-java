package screenplay.models;

import org.openqa.selenium.WebDriver;

public interface Task {
    void perform(WebDriver driver);
}

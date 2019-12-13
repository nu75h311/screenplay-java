package screenplay.pages;

import org.openqa.selenium.By;

public enum TodoMvcPageElements {
    TODO_FIELD(By.className("new-todo")),
    TODO_LIST(By.cssSelector(".todo-list li"));

    private By locator = null;

    TodoMvcPageElements(By locator) {
        this.locator = locator;
    }

    public By locator() {
        return locator;
    }
}
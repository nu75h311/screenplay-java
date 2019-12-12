package screenplay.pages;

import org.openqa.selenium.By;

public enum TodoMvcPageElements {
    TODO_FIELD(By.className("new-todo")),
    TODO_LIST(By.cssSelector(".todo-list li"));

    TodoMvcPageElements(By locator) {
    }
}
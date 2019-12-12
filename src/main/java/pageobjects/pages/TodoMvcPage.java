package pageobjects.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.stereotype.Component;

@Component
public class TodoMvcPage extends BasePage {

    private static final String TODO_MVC_URL = "http://todomvc.com/examples/vanillajs/";

    private By todoField = By.className("new-todo");
    private By todoList = By.cssSelector(".todo-list li");

    public void navigate() {
        browser().get(TODO_MVC_URL);
    }

    public void addTodo(String todoText) {
        browser().findElement(todoField).sendKeys(todoText, Keys.ENTER);
    }

    public void addTodos(String... todoList) {
        Arrays.stream(todoList).forEach(this::addTodo);
    }

    public List<String> getTodosList() {
        List<String> todos = new ArrayList<>();
        browser().findElements(todoList).forEach(item -> todos.add(item.getText()));
        return todos;
    }
}

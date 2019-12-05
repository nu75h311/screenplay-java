package pageobjects.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By todoField = By.className("new-todo");
    private By todoList = By.cssSelector(".todo-list li");

    public HomePage(final WebDriver driver) {
        this.driver = driver;
    }

    public void addTodo(String todoText) {
        driver.findElement(todoField).sendKeys(todoText, Keys.ENTER);
    }

    public void addTodos(String... todoList) {
        Arrays.stream(todoList).forEach(this::addTodo);
    }

    public List<String> getTodosList() {
        List<String> todos = new ArrayList<>();
        driver.findElements(todoList).forEach(item -> todos.add(item.getText()));
        return todos;
    }
}

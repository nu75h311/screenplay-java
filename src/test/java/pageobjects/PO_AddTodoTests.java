package pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import pageobjects.base.BaseTest;
import pageobjects.base.SpringConfig;
import pageobjects.pages.TodoMvcPage;

@SpringJUnitConfig(SpringConfig.class)
public class PO_AddTodoTests extends BaseTest {

    @Autowired
    protected TodoMvcPage todoMvcPage;

    @BeforeEach
    public void goToApp() {
        todoMvcPage.navigate();
    }

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        todoMvcPage.addTodo("Feed the cat");
        assertThat(todoMvcPage.getTodosList(), hasSize(1));
        assertThat(todoMvcPage.getTodosList(), contains("Feed the cat"));
    }

    @Test
    public void should_be_able_to_add_additional_todo_items() {
        todoMvcPage.addTodos("Feed the cat", "Take out the garbage");
        todoMvcPage.addTodo("Walk the dog");
        assertThat(todoMvcPage.getTodosList(), hasSize(3));
        assertThat(todoMvcPage.getTodosList(), contains("Feed the cat", "Take out the garbage", "Walk the dog"));
    }
}

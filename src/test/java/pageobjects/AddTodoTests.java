package pageobjects;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import pageobjects.base.BaseTest;
import pageobjects.base.SpringConfig;
import pageobjects.pages.HomePage;

@SpringJUnitConfig(SpringConfig.class)
public class AddTodoTests extends BaseTest {

    @Autowired
    protected HomePage homePage;

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        homePage.addTodo("Feed the cat");
        assertThat(homePage.getTodosList()).hasSize(1)
                                           .contains("Feed the cat");
    }

    @Test
    public void should_be_able_to_add_additional_todo_items() {
        homePage.addTodos("Feed the cat", "Take out the garbage");
        homePage.addTodo("Walk the dog");
        assertThat(homePage.getTodosList()).hasSize(3)
                                           .contains("Feed the cat", "Take out the garbage", "Walk the dog");
    }
}

package pageobjects.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pageobjects.pages.BasePage;
import pageobjects.pages.TodoMvcPage;

@Component
public class BaseTest {

    @Autowired
    protected BasePage basePage;

    @Autowired
    protected TodoMvcPage todoMvcPage;

    @BeforeEach
    public void setUp() {
        basePage.openBrowser();
    }

    @AfterEach
    public void tearDown() {
        basePage.closeBrowser();
    }
}

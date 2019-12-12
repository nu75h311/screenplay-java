package pageobjects.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pageobjects.pages.BasePage;
import pageobjects.pages.HomePage;

@Component
public class BaseTest {

    @Autowired
    protected BasePage basePage;

    @Autowired
    protected HomePage homePage;

    @BeforeEach
    public void setUp() {
        basePage.openBrowser();
        homePage.navigate();
    }

    @AfterEach
    public void tearDown() {
        basePage.closeBrowser();
    }
}

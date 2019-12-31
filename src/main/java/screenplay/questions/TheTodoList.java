package screenplay.questions;

public class TheTodoList {

    public static TheTodoListSize sizeIs(int expectedSize) {
        return new TheTodoListSize(expectedSize);
    }

    public static TheTodoListContents contentsHave(String... todoItems) {
        return new TheTodoListContents(todoItems);
    }
}

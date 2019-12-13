package screenplay.questions;

public class TheTodoList {

    public static TheTodoListSize size() {
        return new TheTodoListSize();
    }

    public static TheTodoListContents contents() {
        return new TheTodoListContents();
    }
}

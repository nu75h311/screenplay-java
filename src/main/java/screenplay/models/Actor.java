package screenplay.models;

public class Actor {

    private String name;

    public Actor(String called) {
        name = called;
    }

    public void wasAbleTo(Task task) {
        perform(task);
    }

    public void attemptsTo(Task task) {
        perform(task);
    }

    public void shouldSee(Question question) {
        ask(question);
    }

    private void ask(Question question) {
        question.ask();
    }

    private void perform(final Task task) {
        task.perform();
    }
}

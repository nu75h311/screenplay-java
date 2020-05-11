package screenplay.models;

public abstract class Actor {

    protected final String name;

    public Actor(String called) {
        this.name = called;
    }

    public String name() {
        return this.name;
    }

    public <T extends Actor> Actor whoCan(Ability<T> ability) {
        ability.acquire((T) this);
        return this;
    }

    public <T extends Actor> void wasAbleTo(Task<T> task) {
        task.perform((T) this);
    }

    public <T extends Actor> void attemptsTo(Task<T> task) {
        task.perform((T) this);
    }

    public <T extends Actor> void shouldSeeThat(Question<T> question) {
        question.ask((T) this);
    }

    public abstract void cleanUp();
}

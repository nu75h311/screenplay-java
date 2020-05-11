package screenplay.tasks;

import java.util.Arrays;

import screenplay.actors.WebSurfer;
import screenplay.models.Task;

public class Start {

    public static StartWithAnEmptyList withAnEmptyList() {
        return new StartWithAnEmptyList();
    }

    public static StartWithAListContaining withAListContaining(String... todoItems) {
        return new StartWithAListContaining(todoItems);
    }

    static class StartWithAnEmptyList implements Task<WebSurfer> {

        @Override
        public void perform(WebSurfer actor) {
            actor.getDriver().get("http://todomvc.com/examples/vanillajs/");
            logger.info(() -> actor.name() + " started with an empty todo list.");
        }
    }

    static class StartWithAListContaining implements Task<WebSurfer> {

        String[] todoItems;

        StartWithAListContaining(String... todoItems) {
            this.todoItems = todoItems;
        }

        @Override
        public void perform(WebSurfer actor) {
            actor.wasAbleTo(Start.withAnEmptyList());
            Arrays.stream(todoItems).forEach(todoItem -> actor.wasAbleTo(AddATodoItem.called(todoItem)));
        }
    }
}

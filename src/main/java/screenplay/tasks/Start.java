package screenplay.tasks;

import screenplay.models.Task;

public class Start implements Task {

    public static Start withAnEmptyList() {
        return new Start();
    }

    @Override
    public void perform() {
        System.out.println("Starting with an empty list.");
    }
}

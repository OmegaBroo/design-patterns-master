package participants;

import interfaces.Command;

public class Instructor {

    private Command command;

    public void setExercise(Command command) {
        this.command = command;
    }

    public String switchExercise() {
        System.out.println("Instructor is switching the exercise.");
        return this.command.execute();
    }
}

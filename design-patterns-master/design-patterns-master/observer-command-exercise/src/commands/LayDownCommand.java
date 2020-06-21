package commands;

import interfaces.Command;

public class LayDownCommand implements Command {

    private Exercise exercise;

    public LayDownCommand(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public String execute() {
        return this.exercise.layDown();
    }
}

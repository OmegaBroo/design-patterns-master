import commands.Exercise;
import commands.GetUpCommand;
import commands.LayDownCommand;
import interfaces.Command;
import participants.Instructor;
import participants.Trainee;
import participants.Viewer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        Exercise exercise = new Exercise();
        Trainee trainee = new Trainee();
        Command getUpExercise = new GetUpCommand(exercise);
        Command goDownCommand = new LayDownCommand(exercise);
        List<Viewer> viewers = new ArrayList<>();

        viewers.add(new Viewer("Georgi"));
        viewers.add(new Viewer("Dragan"));
        viewers.add(new Viewer("Petkan"));

        for (Viewer viewer : viewers) {
            trainee.subscribe(viewer);
        }

        instructor.setExercise(getUpExercise);
        trainee.doExercise(instructor.switchExercise());
        System.out.println();

        instructor.setExercise(goDownCommand);
        trainee.doExercise(instructor.switchExercise());
    }
}


package participants;

import interfaces.Observable;
import interfaces.Observer;

public class Viewer implements Observer {

    private String name;
    private Observable trainee;

    public Viewer(String name) {
        this.setName(name);
    }

    @Override
    public void update() {
        if (trainee != null) {
            String exercise = trainee.getUpdate();
            System.out.println(this.name + " updated exercise to " + exercise);
        } else {
            System.out.println("Trainee is't here");
        }
    }

    @Override
    public void setTrainee(Observable trainee) {
        this.trainee = trainee;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package participants;

import interfaces.Observable;
import interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String exercise;

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTrainee(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.exercise;
    }

    public void doExercise(String exercise) {
        this.exercise = exercise;
        System.out.println("Trainee starts to " + this.exercise);
        this.notifyObservers();
    }
}

package ChainOfResponsibility;

import Observer.Boy;
import State.EmployeeState;

public abstract class Employee {

    public static final int PLOVDIV = 1;
    public static final int BULGARIA = 2;
    public static final int ABROAD = 3;

    private String name;
    private Boy observer;
    private EmployeeState state;
    private int qualification;
    private Employee nextEmployee;

    public Employee(String name) {
        this.name = name;
    }

    abstract void preparePackage(Package newPackage);

    public void notifyObserver() {
        observer.changeState(this);
    }

    public void prepareOrPassToNext(Package newPackage) {
        String stateName = this.state.getStateName();

        if (this.qualification == newPackage.getEmployeeQualification() && stateName.equals("WAITING_FOR_CUSTOMER")) {
            this.preparePackage(newPackage);
        }
        else {
            this.nextEmployee.prepareOrPassToNext(newPackage);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boy getObserver() {
        return observer;
    }

    public void setObserver(Boy observer) {
        this.observer = observer;
    }

    public EmployeeState getState() {
        return state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
        this.notifyObserver();
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public Employee getNextEmployee() {
        return nextEmployee;
    }

    public void setNextEmployee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }
}

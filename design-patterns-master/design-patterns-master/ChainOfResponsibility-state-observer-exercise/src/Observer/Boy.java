package Observer;

import ChainOfResponsibility.Employee;
import State.EmployeeState;
import State.WaitingForCustomer;

public class Boy {

    private String name;

    public Boy(String name){
        this.name = name;
    }

    public void changeState(Employee employee) {
        EmployeeState state = employee.getState();

        if (state.getStateName() == "PREPARING_THE_PACKAGE") {
            System.out.println(this.getName() + " is going to carry that package to the storehouse");

            WaitingForCustomer waitingState = new WaitingForCustomer();
            employee.setState(waitingState);
        }
        else {
            System.out.println(this.getName() + " is watching " + employee.getName() + " who is waiting for next customer");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

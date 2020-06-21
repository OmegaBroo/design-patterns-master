package State;

import ChainOfResponsibility.Employee;

public class WaitingForCustomer implements EmployeeState {

    private String name = "WAITING_FOR_CUSTOMER";

    @Override
    public void setState(Employee employee) {
        employee.setState(this);
    }

    @Override
    public String getStateName() {
        return this.name;
    }
}

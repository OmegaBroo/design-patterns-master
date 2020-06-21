package State;

import ChainOfResponsibility.Employee;

public class PreparingPackage implements EmployeeState {

    private String name = "PREPARING_THE_PACKAGE";

    @Override
    public void setState(Employee employee) {
        employee.setState(this);
    }

    @Override
    public String getStateName() {
        return this.name;
    }
}

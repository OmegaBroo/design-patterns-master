package State;

import ChainOfResponsibility.Employee;

public interface EmployeeState {

    public void setState(Employee employee);
    public String getStateName();
}

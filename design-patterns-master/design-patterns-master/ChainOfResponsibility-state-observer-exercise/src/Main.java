import ChainOfResponsibility.AbroadEmployee;
import ChainOfResponsibility.BulgariaEmployee;
import ChainOfResponsibility.Employee;
import ChainOfResponsibility.Package;
import ChainOfResponsibility.PlovdivEmployee;
import Observer.Boy;
import State.EmployeeState;
import State.PreparingPackage;
import State.WaitingForCustomer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee abroadEmployee = new AbroadEmployee("Angel");
        Employee bulgariaEmployee = new BulgariaEmployee("Kamen");
        Employee plovdivEmployee = new PlovdivEmployee("Miro");

        Boy observer = new Boy("Simeon");

        List<Employee> employees = new ArrayList<>();
        employees.add(abroadEmployee);
        employees.add(bulgariaEmployee);
        employees.add(plovdivEmployee);

        EmployeeState preparing = new PreparingPackage();
        EmployeeState waitingForCustomer = new WaitingForCustomer();

        abroadEmployee.setNextEmployee(bulgariaEmployee);
        bulgariaEmployee.setNextEmployee(plovdivEmployee);

        for (int i = 0; i < employees.size(); i++){
            Employee temp = employees.get(i);
            temp.setObserver(observer);
            waitingForCustomer.setState(temp);
        }

        bulgariaEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.PLOVDIV));
        abroadEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.PLOVDIV));
        abroadEmployee.prepareOrPassToNext(new Package("Package for France", Employee.ABROAD));
        bulgariaEmployee.prepareOrPassToNext(new Package("Package for Burgas", Employee.BULGARIA));
        plovdivEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.PLOVDIV));
    }
}

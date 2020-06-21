package ChainOfResponsibility;

import State.PreparingPackage;

public class BulgariaEmployee extends Employee {

    public BulgariaEmployee(String name) {
        super(name);
        this.setQualification(Employee.BULGARIA);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(this.getName() + " is preparing package " + newPackage.getName());
        this.setState(new PreparingPackage());
    }
}

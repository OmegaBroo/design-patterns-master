package ChainOfResponsibility;

import State.PreparingPackage;

public class AbroadEmployee extends Employee {

    public AbroadEmployee(String name) {
        super(name);
        this.setQualification(Employee.ABROAD);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(this.getName() + " is preparing package " + newPackage.getName());
        this.setState(new PreparingPackage());
    }
}

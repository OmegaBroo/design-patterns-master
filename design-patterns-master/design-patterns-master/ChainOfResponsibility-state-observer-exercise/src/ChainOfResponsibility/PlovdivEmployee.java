package ChainOfResponsibility;

import State.PreparingPackage;

public class PlovdivEmployee extends Employee {

    public PlovdivEmployee(String name) {
        super(name);
        this.setQualification(Employee.PLOVDIV);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(this.getName() + " is preparing package " + newPackage.getName());
        this.setState(new PreparingPackage());
    }
}

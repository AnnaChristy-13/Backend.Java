package homework21.inharitance.task2;

import homework21.inharitance.task2.Employee;

public class Manager extends Employee{

    private Employee[] empolyees;

    public Manager(String surname, String name, int id, Employee[] empolyees) {
        super(surname, name, id);
        this.empolyees = empolyees;
    }

    public Employee[] getEmpolyees() {
        return empolyees;
    }
}

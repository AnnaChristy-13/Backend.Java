package homework21.inharitance.task2;

public class Developer extends Employee{

private String [] projects;

    public Developer(String surname, String name, int id, String[] projects) {
        super(surname, name, id);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }
}

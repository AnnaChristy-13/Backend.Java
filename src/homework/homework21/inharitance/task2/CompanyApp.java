package homework21.inharitance.task2;

import java.util.Arrays;

public class CompanyApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Smith", "Will", 123);
        Employee employee2 = new Employee("Williams", "Steve", 567);
        Employee employee3 = new Employee("Johnson", "Emilie", 764);
        Employee employee4 = new Employee("Taylor", "Elizabeth", 657);

        Employee[] employees = {employee1, employee2, employee3, employee4};

        Manager manager = new Manager("Fischer", "Erick", 987, employees);

        String[] projects = {"Engineering of bilding's complex", "Construction of building's complex", "Comissioning of bulding's complex"};

        Developer developer1 = new Developer("Jackson", "Martin", 563,projects);
        Developer developer2 = new Developer("Clark", "Anna", 793, projects);
        Developer developer3 = new Developer("Lewis", "Robert", 502, projects);


        System.out.println("List of employees in the company");
//        for (Employee employee : employees) {
//            System.out.println(employee);

            for (int i = 0; i < projects.length; i++) {
                System.out.println(projects[i]);

            }



        System.out.println("=====================================");
        System.out.println("Manager of company" + manager.getSurname() + " " + manager.getName());

        System.out.println("=====================================");
        System.out.println("First developer: " + developer1.getSurname() + " " + developer1.getName());
        System.out.println("Second developer: " + developer2.getSurname() + " " + developer2.getName());
        System.out.println("Third developer :" + developer3.getSurname() + " " + developer3.getName());

        System.out.println("=================================");
        System.out.println("List of projects in the company :");
        for(String project : projects) {
            System.out.println(project);
        }



        }
    }



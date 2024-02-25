package lesson28.practice;

import java.util.*;

//1) Создайте коллекцию для хранения данных о сотрудниках в компании.
//Сотрудник имеет уникальный персональный код
//Добавьте пять элементов (пять сотрудников)
//
//2) Создайте два отдела и распределите сотрудников по отделам
//
//3) Создайте коллекцию по отделам и сотрудникам в каждом отделе
//
//4) создайте коллекцию всех отделов
//
//
//класс Employee
//- персональный код (id)
//- имя
//
//класс Department
//- название

public class CompanyData {
    public static void main(String[] args) {
        Employee employee1 = new Employee("123", "Johnson");
        Employee employee2 = new Employee("678", "Simpson");
        Employee employee3 = new Employee("950", "Anderson");
        Employee employee4 = new Employee("659", "Fischer");
        Employee employee5 = new Employee("876", "Smith");

        List<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        Department department1 = new Department("HR");
        Department department2 = new Department("Service");
        Department department3 = new Department("Sales");

        Map<Department, List<Employee>> departmentWithEmployees = new HashMap<>();
        departmentWithEmployees.put(department1, new ArrayList<>());
        departmentWithEmployees.put(department2, new ArrayList<>());

        departmentWithEmployees.get(department1).add(employees.get(1));
        departmentWithEmployees.get(department1).add(employees.get(3));
        departmentWithEmployees.get(department2).add(employees.get(0));
        departmentWithEmployees.get(department2).add(employees.get(2));
        departmentWithEmployees.get(department2).add(employees.get(4));

        System.out.println(departmentWithEmployees);

        List<Department> departments = new ArrayList<>(departmentWithEmployees.keySet());

        System.out.println("Все отделы:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}












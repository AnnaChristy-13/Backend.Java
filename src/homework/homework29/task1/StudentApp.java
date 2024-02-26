package homework29.task1;

import homework29.task1.Student;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Johnson","John"));
        students.add(new Student("Smith","Karolina"));
        students.add(new Student("Williams","Adrian"));
        students.add(new Student("Jobbs","Steve"));
        students.add(new Student("Jackson","Helene"));


        System.out.println("The list of student: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }

        System.out.println("==================================");
        System.out.println("The list of student in reserve order: ");
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }

        students.remove(3);

        System.out.println("=================================");
        System.out.println("Updated list of students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }







    }
}

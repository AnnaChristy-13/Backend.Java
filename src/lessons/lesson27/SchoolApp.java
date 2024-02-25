package lesson27;


import java.util.LinkedList;
import java.util.List;

public class SchoolApp {

    public static void main(String[] args) {

        Student student1 = new Student("345", "Ivanov");
        Student student2 = new Student("475", "Petrova");
        Student student3 = new Student("576", "Semenov");
        Student student4 = new Student("089", "Sidorova");

        List<Student> students = new LinkedList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        Teacher teacher1 = new Teacher("456", "Smith");
        Teacher teacher2 = new Teacher("309", "Fischer");

        List<Teacher> teachers = new LinkedList<>();

        teachers.add(teacher1);
        teachers.add(teacher2);

        // Create a course and associate it with a teacher
        Course course1 = new Course("English for begginers", "111", teacher1);
        Course course2 = new Course("German B1", "112", teacher2);

        List<Course> courses = new LinkedList<>();

        courses.add(course1);
        courses.add(course2);

        course1.addNewStudent(student2);
        course1.addNewStudent(student3);
        course2.addNewStudent(student1);
        course2.addNewStudent(student4);

        System.out.println("Students attended English course:");
        for (Student student : course1.getStudents()){
            System.out.println(student.getStudentName());

        }
        System.out.println("===========================");
        System.out.println("Students attended German B1");
        for(Student student : course2.getStudents()){
            System.out.println(student.getStudentName());
        }
        System.out.println("==========================");
        System.out.println("Courses taught by Mr.Smith");
        System.out.println(course1.getCourseName());

        System.out.println("==========================");
        System.out.println("Courses taught by Mr.Fischer");
        System.out.println(course2.getCourseName());






    }
}

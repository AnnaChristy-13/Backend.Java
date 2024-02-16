package Project1;

import java.util.Arrays;

public class StudentSortDemo {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        Student [] students = service.createStudentsArrayFromUserInput();
        service.fillStudentsArrayFromUserInput(students);
        service.sortStudents(students);
        System.out.println(Arrays.toString(students));
        service.printStudent(students);

    }
}

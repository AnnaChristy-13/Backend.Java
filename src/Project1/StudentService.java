package Project1;

import lessons06.scanner.UserInput;

import java.util.Arrays;

public class StudentService {

    public Student[] createStudentsArrayFromUserInput() {

        UserInput userInput = new UserInput();
        int lengthOfStudentArray = userInput.inputInteger("Enter please amount of Student in the Group ");
//    Student[] students = new Student[lengthOfStudentArray];
        return new Student[lengthOfStudentArray];
    }

    public void fillStudentsArrayFromUserInput(Student[] students) {

        UserInput userInput = new UserInput();
        for (int i = 0; i < students.length; i++) {

            students[i] = createStudentFromUserInput();

        }

    }

    private Student createStudentFromUserInput() {

        UserInput userInput = new UserInput();

        String lastName = userInput.inputText("Enter please student's last name ");
        String firstName = userInput.inputText("Enter please student's fist name ");
        int age = userInput.inputInteger("Enter please student's age ");
        return new Student(lastName, firstName, age);
    }


    public void sortStudents(Student[] students) {
        System.out.println("===================================");
        System.out.println("Students were sorted by last name: ");

        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getLastName().compareTo(students[j + 1].getLastName()) > 0) {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

//
                }

            }

        }
    }
//
//}

        public void printStudent (Student[] students){
            System.out.println("=================================");
            System.out.println("Date of all students in the group");
            for (int i = 0; i < students.length; i++) {
                System.out.print("Student " + (i+1) + ": ");
                System.out.println("Last name of student: " + students[i].getLastName() + ", First name of student: " + students[i].getFirstName() + ", Age of the student: " + students[i].getAge());

            }
        }
    }


package lesson27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Курс включает в себя: название курса,
//идентификатор курса (уникальный), преподавателя, список студентов.
public class Course {
    private String courseName;
    private String courseID;
    private Teacher teacher;

    private List<Student> students;

    public Course(String courseName, String courseID, Teacher teacher) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.teacher = teacher;
        this.students = new LinkedList<>();
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}

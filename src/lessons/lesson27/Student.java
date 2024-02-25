package lesson27;

//Студент имеет следующие атрибуты: студенческий номер (уникальный), имя, список курсов.

public class Student {

    private String idNumer;
    private String studentName;

    public Student(String idNumer, String studentName) {
        this.idNumer = idNumer;
        this.studentName = studentName;
    }

    public String getIdNumer() {
        return idNumer;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumer='" + idNumer + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
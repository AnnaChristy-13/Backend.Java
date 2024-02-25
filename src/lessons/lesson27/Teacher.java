package lesson27;

public class Teacher {
//    Преподаватель имеет следующие атрибуты:
//    идентификатор (уникальный), имя.
    private String teacherID;
    private String teacherName;



    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }


    public String getTeacherName() {
        return teacherName;
    }

    }



package lesson29.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Есть список студентов и их годовая оценка по различным предметам (один предмет - одна оценка)
//Написать программу которая принимает данные об оценках студентов
//и предоставляет возможность получить данные об оценках конкретного студента
//Map
//ключ - имена студентов
//значение - коллекция Map (название предмета - оценка)

public class StudentsApp {
    public static void main(String[] args) {



        Map<String, Map<String, Integer>> studentsApp = new HashMap<>();


        addStudentNote(studentsApp, "Johnson", "Chemistry", 3);
        addStudentNote(studentsApp, "Johnson", "German", 5);
        addStudentNote(studentsApp, "Smith", "Chemistry", 4);
        addStudentNote(studentsApp, "Smith", "German", 1);
        addStudentNote(studentsApp, "Taylor", "Chemistry", 3);
        addStudentNote(studentsApp, "Taylor", "German", 2);
        addStudentNote(studentsApp, "Willoams", "Chemistry", 1);
        addStudentNote(studentsApp, "Williams", "German", 1);
    }

        public static void addStudentNote (Map < String, Map < String, Integer >> studentsApp, String
        studentName, String subjectName,int studentNote){

            if (studentsApp.get(studentName) == null) {
                studentsApp.put(studentName, new HashMap<>());
            }
            studentsApp.putIfAbsent(studentName, new HashMap<>());
            studentsApp.get(studentName).put(subjectName, studentNote);
        }

        public static int getStudentNote (Map < String, Map < String, Integer >> studentsApp, String studentName, String subjectName){
            if (studentsApp.containsKey(studentName) && studentsApp.get(studentName).containsKey(subjectName)) {
                return studentsApp.get(studentName).get(subjectName);
            } else {
        return -1;
    }


        }

    }



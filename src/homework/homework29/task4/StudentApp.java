package homework29.task4;
//*Отслеживание оценок студентов:**
//        - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
//    - Добавьте данные пяти студентов.
//        - Найдите и выведите имя студента с наивысшим средним баллом.
//    - Измените средний балл одного из студентов и выведите обновленные данные.

import java.util.HashMap;
import java.util.Map;

public class StudentApp {
    public static void main(String[] args) {


        Map<String,Double> students = new HashMap<>();

        students.put("Williams", 93.6);
        students.put("Jackson", 64.4);
        students.put("Stark", 43.7);
        students.put("Clarkson", 87.9);
        students.put("Richardson", 75.1);


        System.out.println(students.entrySet());

        Double bestGrade = 0.0;
        String bestStudent = "";
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() > bestGrade) {
                bestGrade = entry.getValue();
                bestStudent = entry.getKey();
            }
        }
        System.out.println(" ");
        System.out.println("The best student " + bestStudent + " has " + bestGrade);


        students.put("Stark", 55.3);

        System.out.println(" ");
        System.out.println("Updated grades for students:");
        System.out.println(students.entrySet());

    }


}

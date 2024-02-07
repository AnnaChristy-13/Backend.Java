package homework14;
//Дан массив слов.
//Создать два массива:
//- один из слов в котором нечетное количество букв
//- второй в котором четное

public class task6 {
    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int evenLetterCounter = 0;
        int oddLetterCounter = 0;
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDays[i].length() % 2 == 0) {
                evenLetterCounter++;
            } else {
                oddLetterCounter++;
            }

        }
        System.out.println("EvenNumberCounter" + evenLetterCounter);
        System.out.println("OddNumberCounter" + oddLetterCounter);
    }
}

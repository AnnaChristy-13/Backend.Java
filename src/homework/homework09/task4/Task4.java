package homework09.task4;

public class Task4 {
    public static void main(String[] args) {

        // Записывание в переменную случайное число от 0 до 12
        int mark = (int) (Math.random() * 12);

        //Записание в переменную оставшееся время. На сегодня у него осталось 45 минут
        int TVTimeLeft = 45;

        System.out.println("Your mark today " + mark);

//    Если оценка от 10 до 12 баллов ->Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
//                от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
//                от 4 до 6 -> Нейтральные слова + ко времени 15 минут
//                3 -> Огорчитесь. Минус 30 минут ко времени
//                оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено!
//    Используем метод Switch

        switch (mark) {
            case 12:
            case 11:
            case 10:
                System.out.println("Super! I am very proud of you!");
                TVTimeLeft += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Well done!");
                TVTimeLeft += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("I know you can do better!");
                TVTimeLeft += 15;
                break;
            case 3:
                System.out.println("It's of course very sad. You have to spelt more time by learning");
                TVTimeLeft -= 30;
                break;
            default:
                System.out.println("Today is no TV!!!");
                TVTimeLeft = 0;
        }
//      Вывод на экран время оставшееся на сегодня для просмотра ТВ

        System.out.println("TV time left today: " + TVTimeLeft + " min");


    }
}
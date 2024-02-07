package homework11;

//4. Используйте двойной цикл для генерации таблицы умножения
public class Task4 {

        public static void main(String[] args) {

            // Размер таблицы умножения 10 x 10
            int size = 10;

            //Создаем первый цикл таблицы умножения

            for (int i = 1; i <= size; i++) {

            //Создаем второй цикл таблицы умножения

                for (int j = 1; j <= size; j++) {

                    // Выводим результат умножения i на j

                    System.out.println((i) + " x " + (j) + " = " + (i*j));
                }


            }
        }

}

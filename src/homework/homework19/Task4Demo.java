package homework19;

public class Task4Demo {

    int firstArray[] = new int[5];
    int secondArray[] = new int[5];

// Создаем метод для создания 1-го и второго массива из случайных чисел.

    public int [] createArrays() {
        for (int i = 0; i < 5; i++) {
            firstArray[i] = (int) (Math.random() * 5) + 1;

        }
        return firstArray;
    }

    public int [] createArrays1() {
        for (int i = 0; i < 5; i++) {
            secondArray[i] = (int) (Math.random() * 5) + 1;
        }
        return secondArray;

    }

    // Создаем метод для вычисления среднего арифметического каждого из массивов с посощью цикла.
        public void averageAndCompareArray(){

            double average1 = 0;
            double average2 = 0;

            int counter = 5; // размер массива (5 случайнах чисел)

            for (int i = 0; i < 5; i++) {
                average1 += firstArray[i];
                average2 += secondArray[i];
            }
            double newAverage1 = average1/counter;
            double newAverage2 = average2/counter;

            System.out.println("Average arithmetic mean of first array " + newAverage1);
            System.out.println("Average arithmetic mean of second array " + newAverage2);

            // Сравниваем среднее арифметические значения массивов между собой используя оператор if

            if( newAverage1> newAverage2){
                System.out.println("Average arithmetic mean of first array " + newAverage1 + " > " + " more than average arithmetic of second array" + newAverage2);
            } else if(newAverage1 < newAverage2){
                        System.out.println("Average arithmetic mean of first array " + newAverage1 +  " < " + " less than average arithmetic mean of second array "+
                         newAverage2);
            } else {
                System.out.println("Average arithmetic means of both arrays " + newAverage1);
            }
        }



}

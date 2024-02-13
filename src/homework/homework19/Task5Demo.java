package homework19;

import lessons06.scanner.UserInput;

import java.util.Arrays;

public class Task5Demo {
    UserInput userInput = new UserInput();
    int number = userInput.inputInteger("Enter please any number that more than 3");

    public int getNumberfromUser() {

        while (number <= 3) {
            if (number <= 3) {
                System.out.println("The number you entered is less than 3, try again");

            } else {
                System.out.println("You entered false number");

            }

        }
        return number;
    }

        // Создаем метод для создания первого массива из случайных чисел.

        int[] randomArray = new int[number];

        public int[] createArray () {

            for (int i = 0; i < number; i++) {
                randomArray[i] = (int) (Math.random() * number) + 1;

            }
            return randomArray;
        }

        public void createArrayWithEvenNumbers () {
            int[] secondArray = randomArray;
            int arrayCounter = 0;
            for (int i = 0; i < secondArray.length; i++) {
                if (secondArray[i] % 2 == 0) {
                    secondArray[arrayCounter] = randomArray[i];
                    arrayCounter++;
                }
                else{
                    secondArray[arrayCounter]=0;
                }
            }
            System.out.println(Arrays.toString(randomArray));
        }
    }

